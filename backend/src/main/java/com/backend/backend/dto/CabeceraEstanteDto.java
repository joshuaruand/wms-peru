package com.backend.backend.dto;
import lombok.Data;

@Data
public class CabeceraEstanteDto {
    private String ubicacion;
    private String tipoAlmacen;
    private String tipoEstante;

    public CabeceraEstanteDto(String ubicacion, String tipoAlmacen, String tipoEstante) {
        this.ubicacion = ubicacion;
        this.tipoAlmacen = tipoAlmacen;
        this.tipoEstante = tipoEstante;
    }

    public CabeceraEstanteDto() {
    }
}
