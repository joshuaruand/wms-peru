package com.backend.backend.dto;

import lombok.Data;

@Data
public class EspaciosDto {

    private Integer idEspacio;
    private Integer numeroFila;
    private Integer numeroColumna;
    private String tipoEspacio;
    private Integer cantPaquetesUbicados;
    private Integer capacidad;

    public EspaciosDto(Integer idEspacio, Integer numeroFila, Integer numeroColumna, String tipoEspacio, Integer cantPaquetesUbicados, Integer capacidad) {
        this.idEspacio = idEspacio;
        this.numeroFila = numeroFila;
        this.numeroColumna = numeroColumna;
        this.tipoEspacio = tipoEspacio;
        this.cantPaquetesUbicados = cantPaquetesUbicados;
        this.capacidad = capacidad;
    }
}
