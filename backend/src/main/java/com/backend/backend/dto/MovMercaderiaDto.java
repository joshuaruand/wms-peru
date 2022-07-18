package com.backend.backend.dto;

import lombok.Data;

@Data
public class MovMercaderiaDto {
    /*
create TABLE MOV_MERCADERIA(
	ID_MOVIMIENTO SERIAL,
	TIPO_MOVIMIENTO VARCHAR(20) NOT NULL,
	ID_ORDEN INTEGER,
	ID_BIEN INTEGER,
	PRIMARY KEY (ID_MOVIMIENTO, ID_ORDEN),
	foreign key (ID_ORDEN) REFERENCES ORDEN(ID_ORDEN) on delete cascade,
	foreign key (ID_BIEN) REFERENCES BIEN(ID_BIEN) on delete cascade
);
     */
    private Integer idMovimiento;
    private String tipoMovimiento;
    private Integer idOrden;
    private Integer idBien;

    public MovMercaderiaDto(Integer idMovimiento, String tipoMovimiento, Integer idOrden, Integer idBien) {
        this.idMovimiento = idMovimiento;
        this.tipoMovimiento = tipoMovimiento;
        this.idOrden = idOrden;
        this.idBien = idBien;
    }
}
