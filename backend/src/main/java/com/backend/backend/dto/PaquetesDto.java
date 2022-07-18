package com.backend.backend.dto;


import lombok.Data;

@Data
public class PaquetesDto {
    private Integer idPaquete;
    private String tipoBien;
    private Integer unidades;

    public PaquetesDto(Integer idPaquete, String tipoBien, Integer unidades) {
        this.idPaquete = idPaquete;
        this.tipoBien = tipoBien;
        this.unidades = unidades;
    }
}
