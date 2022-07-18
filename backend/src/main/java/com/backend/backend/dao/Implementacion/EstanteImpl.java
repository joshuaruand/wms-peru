package com.backend.backend.dao.Implementacion;

import com.backend.backend.dao.EstanteDao;
import com.backend.backend.dto.CabeceraEstanteDto;
import com.backend.backend.dto.EstantesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EstanteImpl implements EstanteDao {
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
    public List<EstantesDto> obtenerGrillaEstantes() {
        List<EstantesDto> grilla = new ArrayList<>();
        String sql = "select e.id_estante, 'POLO '|| te.color_estante as tipo_bien,\n" +
                "\tcoalesce((select count(*)  from estante e2 \n" +
                "\tinner join espacio es2\n" +
                "\ton es2.id_estante  =e2.id_estante \n" +
                "\twhere es2.estado_espacio ='LLENO' and e2.id_estante =e.id_estante \n" +
                "\tgroup by e2.id_estante),0) as cant_espacios_llenos\n" +
                ",count(es.id_espacio) as cant_espacios_total\n" +
                "from estante e \n" +
                "inner join tipo_estante te \n" +
                "on te.id_tipo_estante = e.id_tipo_estante \n" +
                "inner join espacio es \n" +
                "on es.id_estante = e.id_estante \n" +
                "where e.id_almacen = 1\n" +
                "group by e.id_estante, te.color_estante\n";
        try {
            obtenerConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                grilla.add(extraerGrillaEstantes(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return grilla;
    }

    @Override
    public CabeceraEstanteDto obtenerCabeceraEstante(EstantesDto estante) {
        CabeceraEstanteDto cabecera = new CabeceraEstanteDto();
        String sql =" select a.direccion_almacen as ubicacion, a.tipo_almacen, te.color_estante as tipo_estante \n" +
                "from almacen a \n" +
                "inner join estante e \n" +
                "on e.id_almacen = a.id_almacen \n" +
                "inner join tipo_estante te \n" +
                "on te.id_tipo_estante = e.id_tipo_estante \n" +
                "where e.id_estante = ?";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, estante.getIdEstante());
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()){
                cabecera= extraerCabeceraEstante(resultado);
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            System.out.println("Something went wrong.");
            throwables.printStackTrace();
        }
        return cabecera;
    }

    private CabeceraEstanteDto extraerCabeceraEstante(ResultSet resultado) throws SQLException {
        CabeceraEstanteDto retorno = new CabeceraEstanteDto(
                resultado.getString("ubicacion"),
                resultado.getString("tipo_almacen"),
                resultado.getString("tipo_estante")
        );
        return retorno;
    }

    private EstantesDto extraerGrillaEstantes(ResultSet resultado) throws SQLException {
        EstantesDto reporte = new EstantesDto(
                resultado.getInt("id_estante"),
                resultado.getString("tipo_bien"),
                resultado.getInt("cant_espacios_llenos"),
                resultado.getInt("cant_espacios_total")

        );
        return reporte;
    }
}
