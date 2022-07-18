package com.backend.backend.dto;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class CitaDto {
    /*
    CREATE TABLE CITA (
	    ID_CITA SERIAL PRIMARY KEY NOT NULL,
	    TIPO_CITA VARCHAR(20) NOT NULL,
	    FECHA_CITA DATE NOT null,
	    HORA_CITA TIME NOT null,
	    ID_ALMACEN INTEGER,
	    NOMBRE_CLIENTE VARCHAR(20) NOT NULL,
	    DOCUMENTO_CLIENTE VARCHAR(8) NOT NULL,
	    foreign key (ID_ALMACEN) REFERENCES ALMACEN(ID_ALMACEN) on delete CASCADE
    );
     */
    private Integer idCita;
    private String tipoCita;
    private Date fechaCita;
    private Time horaCita;
    private Integer idAlmacen;
    private String nombreCliente;
    private String documentoCliente;

    public CitaDto(Integer idCita, String tipoCita, Date fechaCita, Time horaCita, Integer idAlmacen, String nombreCliente, String documentoCliente) {
        this.idCita = idCita;
        this.tipoCita = tipoCita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.idAlmacen = idAlmacen;
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
    }

    public CitaDto() {
    }
}

