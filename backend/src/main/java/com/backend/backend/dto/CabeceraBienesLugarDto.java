package com.backend.backend.dto;

import lombok.Data;

@Data
public class CabeceraBienesLugarDto {
    private Integer idEstante;
    private Integer idEspacio;
    private String colorEstante;
    private String TallaEspacio;

    public CabeceraBienesLugarDto(Integer idEstante, Integer idEspacio, String colorEstante, String tallaEspacio) {
        this.idEstante = idEstante;
        this.idEspacio = idEspacio;
        this.colorEstante = colorEstante;
        TallaEspacio = tallaEspacio;
    }

    public CabeceraBienesLugarDto() {
    }
}
