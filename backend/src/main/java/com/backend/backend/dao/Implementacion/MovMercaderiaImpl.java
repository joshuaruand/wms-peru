package com.backend.backend.dao.Implementacion;

import com.backend.backend.dao.MovMercaderiaDao;
import com.backend.backend.dto.MovMercaderiaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class MovMercaderiaImpl implements MovMercaderiaDao {
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
    public MovMercaderiaDto creacionMovimientoEntrada(MovMercaderiaDto movimiento) {
        String sql ="INSERT INTO MOV_MERCADERIA (tipo_movimiento,id_orden,id_bien) VALUES\n" +
                "('entrada',?, ?)";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, movimiento.getIdOrden());
            sentencia.setInt(2, movimiento.getIdBien());
            sentencia.executeUpdate();
            cerrarConexion(null,sentencia);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return movimiento;
    }
}
