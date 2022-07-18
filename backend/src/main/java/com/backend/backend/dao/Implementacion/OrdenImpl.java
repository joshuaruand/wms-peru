package com.backend.backend.dao.Implementacion;

import com.backend.backend.dao.OrdenDao;
import com.backend.backend.dto.CitaDto;
import com.backend.backend.dto.OrdenDto;
import com.backend.backend.dto.OrdenesRecepcionDetalladoDto;
import com.backend.backend.dto.OrdenesRecepcionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Repository
public class OrdenImpl implements OrdenDao {
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
    //obtencion del codigo de orden asociado al codigo de cita de recepcion
    @Override
    public OrdenDto obtenerIdOrdenPorIdCita(CitaDto cita) {
        OrdenDto orden = new OrdenDto();
        String sql =" select o.id_orden as \"CODIGO DE ORDEN\"\n" +
                "from orden o\n" +
                "inner join cita ci\n" +
                "on o.id_cita=ci.id_cita\n" +
                "where ci.id_cita = ?";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, cita.getIdCita());
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()){
                orden = extraerIdOrdenPorIdCita(resultado);
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return orden;
    }
    //extracion del codigo de orden asociado al codigo de cita de recepcion
    private OrdenDto extraerIdOrdenPorIdCita(ResultSet resultado) throws SQLException {
        OrdenDto retorno = new OrdenDto(
                resultado.getInt("CODIGO DE ORDEN"),
                null,
                null,
                null,
                null,
                null
        );
        return retorno;
    }

    @Override
    public OrdenDto actualizarFechaHoraOrden(OrdenDto orden) {
        String sql = "update orden \n" +
                "set fecha_orden= current_date, hora_orden = current_time \n" +
                "where id_orden =?";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, orden.getIdOrden());
            sentencia.executeUpdate();
            cerrarConexion(null,sentencia);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return orden;
    }


    @Override
    public List<OrdenesRecepcionDto> obtenerOrdenesRecepcion() {
        List<OrdenesRecepcionDto> lista = new ArrayList<>();
        String sql = "select o.id_orden, c.id_cita,u.nombres_usuario || ' ' || u.apellidos_usuario as responsable, 'POLO '||b.color_bien as tipo_bien, count(paq.id_paquete) as cant_paquetes \n" +
                "from orden o \n" +
                "inner join cita c \n" +
                "on c.id_cita =o.id_cita \n" +
                "inner join usuario u \n" +
                "on u.id_usuario = o.id_usuario \n" +
                "inner join mov_mercaderia mm \n" +
                "on mm.id_orden =o.id_orden \n" +
                "inner join bien b \n" +
                "on b.id_bien =mm.id_bien \n" +
                "inner join polo p \n" +
                "on p.id_bien = b.id_bien \n" +
                "inner join paquete paq\n" +
                "on paq.id_paquete = p.id_paquete \n" +
                "where o.tipo_orden ='recepcion'\n" +
                "group by o.id_orden,  c.id_cita,u.nombres_usuario, u.apellidos_usuario, b.color_bien";
        try {
            obtenerConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                lista.add(extraerOrdenesRecepcion(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lista;
    }


    @Override
    public List<OrdenesRecepcionDetalladoDto> obtenerOrdenesRecepcionDetallado(OrdenDto orden) {
        List<OrdenesRecepcionDetalladoDto> detalle = new ArrayList<>();
        String sql = "select 'P'||paq.id_paquete as cod_paquete, b.color_bien, p.tipo_talla, p.cantidad_polos as unidades\n" +
                "from orden o \n" +
                "inner join cita c \n" +
                "on c.id_cita =o.id_cita \n" +
                "inner join mov_mercaderia mm \n" +
                "on mm.id_orden =o.id_orden \n" +
                "inner join bien b \n" +
                "on b.id_bien =mm.id_bien \n" +
                "inner join polo p \n" +
                "on p.id_bien = b.id_bien \n" +
                "inner join paquete paq\n" +
                "on paq.id_paquete = p.id_paquete \n" +
                "where o.id_orden = ?";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, orden.getIdOrden());
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()){
                detalle.add(extraerOrdenesRecepcionDetallado(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return detalle;
    }

    private OrdenesRecepcionDto extraerOrdenesRecepcion(ResultSet resultado) throws SQLException {
        OrdenesRecepcionDto reporte = new OrdenesRecepcionDto(
                resultado.getInt("id_orden"),
                resultado.getInt("id_cita"),
                resultado.getString("responsable"),
                resultado.getString("tipo_bien"),
                resultado.getInt("cant_paquetes")

        );
        return reporte;
    }
    private OrdenesRecepcionDetalladoDto extraerOrdenesRecepcionDetallado(ResultSet resultado) throws SQLException {
        OrdenesRecepcionDetalladoDto reporte = new OrdenesRecepcionDetalladoDto(
                resultado.getString("cod_paquete"),
                resultado.getString("color_bien"),
                resultado.getString("tipo_talla"),
                resultado.getInt("unidades")
        );
        return reporte;
    }
}
