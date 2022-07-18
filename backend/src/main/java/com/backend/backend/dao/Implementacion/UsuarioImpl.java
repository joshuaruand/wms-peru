package com.backend.backend.dao.Implementacion;

import com.backend.backend.dao.UsuarioDao;
import com.backend.backend.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class UsuarioImpl implements UsuarioDao {
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
    /*
    @Override
    public Usuario creacionUsuario(Usuario usuario1) {
        String sql ="INSERT INTO USUARIO(DNI_USUARIO, NOMBRES_USUARIO, APELLIDOS_USUARIO, CONTRASENA_USUARIO, ID_TIPO_USUARIO)VALUES\n" +
                "(?, ?, ?, ?, ?)\n";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, usuario1.getDniUsuario());
            sentencia.setString(2, usuario1.getNombresUsuario());
            sentencia.setString(3, usuario1.getApellidosUsuario());
            sentencia.setString(4, usuario1.getContrasenaUsuario());
            sentencia.setInt(5, usuario1.getIdTipoUsuario());
            sentencia.executeUpdate();
            cerrarConexion(null,sentencia);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return usuario1;
    }
    /*
    Para mostrar en la pantalla los roles a escoger en la creacion del usuario
    */

    @Override
    public UsuarioDto mostrarUsuarioResponsable() {
        UsuarioDto usuario = new UsuarioDto();
        String sql = "select u.dni_usuario as \"DNI RESPONSABLE\",\n" +
                "u.nombres_usuario ||' '|| u.apellidos_usuario as \"NOMBRE RESPONSABLE\"\n" +
                "from usuario u\n" +
                "inner join orden o \n" +
                "on o.id_usuario =u.id_usuario \n" +
                "where o.id_orden =1";
        try {
            obtenerConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                usuario=(extraerTipoUsuario(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return usuario;
    }

    private UsuarioDto extraerTipoUsuario(ResultSet resultado) throws SQLException {
        UsuarioDto retorno = new UsuarioDto(
                null,
                resultado.getString("DNI RESPONSABLE"),
                resultado.getString("NOMBRE RESPONSABLE"),
                null,
                null,
                null
        );
        return retorno;
    }

}

