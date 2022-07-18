package com.backend.backend.dao.Implementacion;

import com.backend.backend.dao.EspacioDao;
import com.backend.backend.dto.CabeceraBienesLugarDto;
import com.backend.backend.dto.EspaciosDto;
import com.backend.backend.dto.EstantesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EspacioImpl implements EspacioDao {
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
    public List<EspaciosDto> RespuestaEspacios(EstantesDto estante) {
        List<EspaciosDto> grilla = new ArrayList<>();
        String sql = "select es.id_espacio, es.numero_fila,es.numero_columna, te.talla_espacio as tipo_espacio \n" +
                ",count(b.id_bien) as cant_paquetes_ubicados, te.capacidad\n" +
                "from espacio es \n" +
                "inner join estante e\n" +
                "on es.id_estante = e.id_estante \n" +
                "inner join tipo_espacio te \n" +
                "on te.id_tipo_espacio = es.id_tipo_espacio \n" +
                "left join bien b \n" +
                "on b.id_espacio  =es.id_espacio \n" +
                "where e.id_estante = ?\n" +
                "group by es.id_espacio,te.talla_espacio, te.capacidad \n" +
                "order by es.id_espacio";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, estante.getIdEstante());
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()){
                grilla.add(extraerGrillaEspacios(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return grilla;
    }

    @Override
    public CabeceraBienesLugarDto obtenerCabeceraBienesLugar(EspaciosDto espacio) {
        CabeceraBienesLugarDto cabecera = new CabeceraBienesLugarDto();
        String sql ="select es.id_estante,es.id_espacio, te.color_estante, te2.talla_espacio \n" +
                "from espacio es \n" +
                "inner join estante e \n" +
                "on es.id_estante = e.id_estante \n" +
                "inner join tipo_estante te \n" +
                "on te.id_tipo_estante = e.id_tipo_estante \n" +
                "inner join tipo_espacio te2\n" +
                "on te2.id_tipo_espacio = es.id_tipo_espacio \n" +
                "where es.id_espacio = ?;";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, espacio.getIdEspacio());
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()){
                cabecera= extraerCabeceraBienesLugar(resultado);
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cabecera;
    }
    private CabeceraBienesLugarDto extraerCabeceraBienesLugar(ResultSet resultado) throws SQLException {
        CabeceraBienesLugarDto retorno = new CabeceraBienesLugarDto(
                resultado.getInt("id_estante"),
                resultado.getInt("id_espacio"),
                resultado.getString("color_estante"),
                resultado.getString("talla_espacio")
        );
        return retorno;
    }

    private EspaciosDto extraerGrillaEspacios(ResultSet resultado) throws SQLException {
        EspaciosDto reporte = new EspaciosDto(
                resultado.getInt("id_espacio"),
                resultado.getInt("numero_fila"),
                resultado.getInt("numero_columna"),
                resultado.getString("tipo_espacio"),
                resultado.getInt("cant_paquetes_ubicados"),
                resultado.getInt("capacidad")

        );
        return reporte;
    }

}
