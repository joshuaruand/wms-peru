package com.backend.backend.dao.Implementacion;

import com.backend.backend.dao.CitaDao;
import com.backend.backend.dto.CitaDto;
import com.backend.backend.dto.CodigoCitaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CitaImpl implements CitaDao {
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

    /* select id_cita as "CODIGO DE CITA"
    from cita where tipo_cita = 'recepcion' and id_almacen = 1;*/
    //obtencion de los codigos de cita de recepcion
    @Override
    public List<CodigoCitaDto> obtenerIdCitasRecepcion() {
        List<CodigoCitaDto> lista= new ArrayList<>();
        String sql = "select id_cita as \"CODIGO DE CITA\"\n" +
                "from cita\n" +
                "where tipo_cita = 'recepcion' and id_almacen = 1;";
        try {
            obtenerConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                lista.add(extraerIdCitasRecepcion(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lista;
    }

    @Override
    public CitaDto verificarCitaProgramada(CitaDto cita) {
        String sql ="select ci.fecha_cita as \"FECHA DE LLEGADA PROGRAMADA\"," +
                " ci.hora_cita as \"HORA DE LLEGADA PROGRAMADA\",\n" +
                "ci.documento_cliente as \"DNI TRANSPORTISTA\", ci.nombre_cliente " +
                " as\"NOMBRE TRANSPORTISTA\"\n" +
                "from cita ci where ci.id_cita  = ?";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, cita.getIdCita());
            ResultSet resultado = sentencia.executeQuery();
            cita = new CitaDto();
            while (resultado.next()){
                cita= extraerCitaProgramada(resultado);
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cita;
    }

    //extraccion de los codigos de cita de recepcion
    private CodigoCitaDto extraerIdCitasRecepcion(ResultSet resultado) throws SQLException {
        CodigoCitaDto codigos = new CodigoCitaDto(
                resultado.getInt("CODIGO DE CITA")
        );
        return codigos;
    }

    private CitaDto extraerCitaProgramada(ResultSet resultado) throws SQLException {
        CitaDto retorno = new CitaDto(
                null,
                null,
                resultado.getDate("FECHA DE LLEGADA PROGRAMADA"),
                resultado.getTime("HORA DE LLEGADA PROGRAMADA"),
                null,
                resultado.getString("NOMBRE TRANSPORTISTA"),
                resultado.getString("DNI TRANSPORTISTA")
        );
        return retorno;
    }

}

