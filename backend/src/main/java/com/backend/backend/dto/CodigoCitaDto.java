package com.backend.backend.dto;


import lombok.Data;

@Data
public class CodigoCitaDto {
    private Integer idCita;
    public CodigoCitaDto(Integer idCita) {
        this.idCita = idCita;
    }
}
