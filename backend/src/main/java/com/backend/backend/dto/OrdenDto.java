package com.backend.backend.dto;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class OrdenDto {
    /*
    * CREATE TABLE ORDEN (
	    ID_ORDEN SERIAL PRIMARY KEY NOT NULL,
	    TIPO_ORDEN VARCHAR(20) NOT NULL,
	    FECHA_ORDEN DATE NOT null default CURRENT_DATE,
	    HORA_ORDEN TIME NOT null default CURRENT_TIME,
	    ID_CITA INTEGER,
	    ID_USUARIO INTEGER,
	    foreign key (ID_USUARIO) REFERENCES USUARIO(ID_USUARIO) on delete cascade,
	    foreign key(ID_CITA) REFERENCES CITA(ID_CITA) on delete cascade
    );
    * */

    private Integer idOrden;
    private String tipoOrden;
    private Date fechaOrden;
    private Time horaOrden;
    private Integer idCita;
    private Integer idUsuario;

    public OrdenDto(Integer idOrden, String tipoOrden, Date fechaOrden, Time horaOrden, Integer idCita, Integer idUsuario) {
        this.idOrden = idOrden;
        this.tipoOrden = tipoOrden;
        this.fechaOrden = fechaOrden;
        this.horaOrden = horaOrden;
        this.idCita = idCita;
        this.idUsuario = idUsuario;
    }
    public OrdenDto() {
    }

}
