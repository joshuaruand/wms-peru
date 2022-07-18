package com.backend.backend.dao.Implementacion;

import com.backend.backend.dao.AlmacenDao;
import com.backend.backend.dto.AlmacenDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class AlmacenImpl implements AlmacenDao {
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
    public AlmacenDto obtenerInfoAlmacen() {
        AlmacenDto almacen = new AlmacenDto();
        String sql = "select a.direccion_almacen as ubicacion, a.tipo_almacen\n" +
                "from almacen a \n" +
                "where a.id_almacen =1";
        try {
            obtenerConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                almacen = extraerInfoAlmacen(resultado);
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return almacen;
    }

    private AlmacenDto extraerInfoAlmacen(ResultSet resultado) throws SQLException {
        AlmacenDto info = new AlmacenDto(
                null,
                resultado.getString("tipo_almacen"),
                resultado.getString("ubicacion")
        );
        return info;
    }
}
