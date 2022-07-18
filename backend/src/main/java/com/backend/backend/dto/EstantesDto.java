package com.backend.backend.dto;

import lombok.Data;

@Data
public class EstantesDto {
    /*
    CREATE TABLE ESTANTE(
	ID_ESTANTE INTEGER PRIMARY KEY,
	NUMERO_PASILLO INTEGER,
	ID_TIPO_ESTANTE INTEGER references TIPO_ESTANTE (ID_TIPO_ESTANTE) on delete CASCADE,
	ID_ALMACEN INTEGER REFERENCES ALMACEN (ID_ALMACEN) on delete CASCADE
);
     */
    private Integer idEstante;
    private String tipoBien;
    private Integer cantEspaciosLlenos;
    private Integer CantEspaciosTotal;

    public EstantesDto(Integer idEstante, String tipoBien, Integer cantEspaciosLlenos, Integer cantEspaciosTotal) {
        this.idEstante = idEstante;
        this.tipoBien = tipoBien;
        this.cantEspaciosLlenos = cantEspaciosLlenos;
        CantEspaciosTotal = cantEspaciosTotal;
    }
}
