package com.backend.backend.dto;

import lombok.Data;

@Data
public class OrdenesRecepcionDetalladoDto {
    private String codPaquete;
    private String colorBien;
    private String tipoTalla;
    private Integer unidades;

    public OrdenesRecepcionDetalladoDto(String codPaquete, String colorBien, String tipoTalla, Integer unidades) {
        this.codPaquete = codPaquete;
        this.colorBien = colorBien;
        this.tipoTalla = tipoTalla;
        this.unidades = unidades;
    }
}

