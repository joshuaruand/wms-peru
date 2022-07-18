package com.backend.backend.dto;

import lombok.Data;

@Data
public class PoloSeleccionadoDto {
    /*

     */
    private Integer idPaquete;
    private Integer idBien;
    private String tipoBien;
    private Integer cantidadBienes;

    public PoloSeleccionadoDto(Integer idPaquete, Integer idBien, String tipoBien, Integer cantidadBienes) {
        this.idPaquete = idPaquete;
        this.idBien = idBien;
        this.tipoBien = tipoBien;
        this.cantidadBienes = cantidadBienes;
    }
}

