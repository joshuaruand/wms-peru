package com.backend.backend.dao.Implementacion;

import com.backend.backend.dao.PaquetesDao;
import com.backend.backend.dto.EspaciosDto;
import com.backend.backend.dto.PaquetesDto;
import com.backend.backend.dto.UbicarPaqueteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PaquetesImpl implements PaquetesDao {
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
    public List<PaquetesDto> obtenerPaquetesUbicados(EspaciosDto espacio) {
        List<PaquetesDto> detalle = new ArrayList<>();
        String sql = "select paq.id_paquete\n" +
                "\t\t, get_tipo_bien(b.color_bien,p.tipo_talla,p.tipo_diseno,p.tipo_cuello,p.tipo_manga) as tipo_bien\n" +
                "\t\t,p.cantidad_polos as unidades\n" +
                "\t\tfrom paquete paq\n" +
                "\t\tinner join polo p\n" +
                "\t\ton p.id_paquete = paq.id_paquete \n" +
                "\t\tinner join bien b \n" +
                "\t\ton b.id_bien = p.id_bien \n" +
                "\t\tinner join espacio es \n" +
                "\t\ton es.id_espacio = b.id_espacio \n" +
                "\t\twhere es.id_espacio = ?\n" +
                "\t\torder by paq.id_paquete";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, espacio.getIdEspacio());
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()){
                detalle.add(extraerPaquetesUbicados(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return detalle;
    }

    @Override
    public UbicarPaqueteDto ubicarPaquetes(UbicarPaqueteDto paquete) {
        String sql = "call ubicar_paquete(?, ?)" ;
        try {
            obtenerConexion();
            CallableStatement sentencia = conexion.prepareCall(sql);
            sentencia.setInt(1, paquete.getIdPaquete());
            sentencia.setInt(2, paquete.getIdEspacio());
            sentencia.execute();
            cerrarConexion(null,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return paquete;
    }

    @Override
    public List<PaquetesDto> obtenerPaquetesaUbicar() {
        List<PaquetesDto> detalle = new ArrayList<>();
        String sql = "select paq.id_paquete\n" +
                "\t\tfrom paquete paq\n" +
                "\t\tinner join polo p\n" +
                "\t\ton p.id_paquete = paq.id_paquete \n" +
                "\t\tinner join bien b \n" +
                "\t\ton b.id_bien = p.id_bien \n" +
                "\t\tleft join espacio es \n" +
                "\t\ton es.id_espacio = b.id_espacio \n" +
                "\t\twhere b.id_espacio is null\n" +
                "\t\torder by paq.id_paquete ;";
        try {
            obtenerConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                detalle.add(extraerPaquetesaUbicar(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return detalle;
    }

    private PaquetesDto extraerPaquetesaUbicar(ResultSet resultado) throws SQLException {
        PaquetesDto paquete = new PaquetesDto(
                resultado.getInt("id_paquete"),
                null,
                null
        );
        return paquete;
    }

    private PaquetesDto extraerPaquetesUbicados(ResultSet resultado) throws SQLException {
        PaquetesDto reporte = new PaquetesDto(
                resultado.getInt("id_paquete"),
                resultado.getString("tipo_bien"),
                resultado.getInt("unidades")
        );
        return reporte;
    }
}
