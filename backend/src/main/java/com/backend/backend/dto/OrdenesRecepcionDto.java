package com.backend.backend.dto;

import lombok.Data;

@Data
public class OrdenesRecepcionDto {
    private Integer idOrden;
    private Integer idCita;
    private String tipoBien;
    private String responsable;
    private Integer paquetes;

    public OrdenesRecepcionDto(Integer idOrden, Integer idCita, String tipoBien, String responsable, Integer paquetes) {
        this.idOrden = idOrden;
        this.idCita = idCita;
        this.tipoBien = tipoBien;
        this.responsable = responsable;
        this.paquetes = paquetes;
    }
}
