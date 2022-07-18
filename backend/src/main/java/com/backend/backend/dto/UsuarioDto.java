package com.backend.backend.dto;

import lombok.Data;

@Data
public class UsuarioDto {
    /*
CREATE TABLE USUARIO(
	ID_USUARIO SERIAL PRIMARY KEY NOT NULL,
	DNI_USUARIO VARCHAR(8) NOT NULL,
	NOMBRES_USUARIO VARCHAR(20) NOT NULL,
	APELLIDOS_USUARIO VARCHAR(20) NOT NULL,
	ID_TIPO_USUARIO INTEGER ,
	CONTRASENA_USUARIO VARCHAR(20) NOT NULL,
	ID_ALMACEN INTEGER,
	foreign key (ID_TIPO_USUARIO) REFERENCES TIPO_USUARIO(ID_TIPO_USUARIO) ON DELETE cascade,
	foreign key (ID_ALMACEN) REFERENCES ALMACEN(ID_ALMACEN) on delete cascade
);
  */
    private Integer idUsuario;
    private String dniUsuario;
    private String nombresUsuario;
    private Integer idTipoUsuario;
    private String contrasenaUsuario;
    private Integer idAlmacen;

    public UsuarioDto(Integer idUsuario, String dniUsuario, String nombresUsuario, Integer idTipoUsuario, String contrasenaUsuario, Integer idAlmacen) {
        this.idUsuario = idUsuario;
        this.dniUsuario = dniUsuario;
        this.nombresUsuario = nombresUsuario;
        this.idTipoUsuario = idTipoUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.idAlmacen = idAlmacen;
    }

    public UsuarioDto() {
    }
}

