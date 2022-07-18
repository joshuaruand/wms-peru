package com.backend.backend.dto;

import lombok.Data;

@Data
public class UbicarPaqueteDto {
    private Integer idPaquete;
    private Integer idEspacio;

    public UbicarPaqueteDto(Integer idPaquete, Integer idEspacio) {
        this.idPaquete = idPaquete;
        this.idEspacio = idEspacio;
    }
}

