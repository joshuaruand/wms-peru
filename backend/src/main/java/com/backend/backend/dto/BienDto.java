package com.backend.backend.dto;

import lombok.Data;

@Data
public class BienDto {
    private Integer idBien;
    private String estadoBien;
    private String pesoBien;
    private String colorBien;
    private Integer idEspacio;

    public BienDto(Integer idBien, String estadoBien, String pesoBien, String colorBien, Integer idEspacio) {
        this.idBien = idBien;
        this.estadoBien = estadoBien;
        this.pesoBien = pesoBien;
        this.colorBien = colorBien;
        this.idEspacio = idEspacio;
    }
}

