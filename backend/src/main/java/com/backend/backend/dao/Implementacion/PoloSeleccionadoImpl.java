package com.backend.backend.dao.Implementacion;

import com.backend.backend.dao.PoloSeleccionadoDao;
import com.backend.backend.dto.PoloSeleccionadoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PoloSeleccionadoImpl implements PoloSeleccionadoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Connection conexion;
    private void obtenerConexion() {
        try {
            this.conexion = jdbcTemplate.getDataSource().getConnection();
            conexion.setAutoCommit(false);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    private void cerrarConexion(ResultSet resultado, Statement sentencia) {
        try {
            if (resultado != null) resultado.close();
            if (sentencia != null) sentencia.close();
            this.conexion.commit();
            this.conexion.close();
            this.conexion = null;
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }
    @Override
    public List<PoloSeleccionadoDto> seleccionBienes() {
        /*Se involucra la funcion get_tipo_bien*/
        List<PoloSeleccionadoDto> lista = new ArrayList<>();
        String sql = "select paq.id_paquete \n" +
                "\t\t,b.id_bien,  get_tipo_bien(b.color_bien,p.tipo_talla,p.tipo_diseno,p.tipo_cuello,p.tipo_manga)\n" +
                "\t\tas tipo_bien\n" +
                "\t\t,p.cantidad_polos as cantidad_bienes\n" +
                "\t\tfrom paquete paq\n" +
                "\t\tinner join tipo_paquete tp\n" +
                "\t\ton tp.id_tipo_paquete = paq.id_tipo_paquete \n" +
                "\t\tinner join polo p\n" +
                "\t\ton p.id_paquete = paq.id_paquete \n" +
                "\t\tinner join bien b \n" +
                "\t\ton b.id_bien = p.id_bien \n" +
                "\t\tleft join espacio es \n" +
                "\t\ton es.id_espacio = b.id_espacio \n" +
                "\t\twhere b.estado_bien ='RECIBIDO'\n" +
                "\t\torder by paq.id_paquete; ";
        try {
            obtenerConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                lista.add(extraerseleccionBienes(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lista;
    }

    private PoloSeleccionadoDto extraerseleccionBienes(ResultSet resultado) throws SQLException {
        PoloSeleccionadoDto bien= new PoloSeleccionadoDto(
                resultado.getInt("id_paquete"),
                resultado.getInt("id_bien"),
                resultado.getString("tipo_bien"),
                resultado.getInt("cantidad_bienes")
        );
        return bien;
    }
}
