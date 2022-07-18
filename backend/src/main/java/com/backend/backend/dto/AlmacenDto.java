package com.backend.backend.dto;
import lombok.Data;

@Data
public class AlmacenDto {
    /*
    CREATE TABLE ALMACEN(
	    ID_ALMACEN INTEGER PRIMARY KEY,
	    TIPO_ALMACEN VARCHAR(40),
	    DIRECCION_ALMACEN VARCHAR(20) unique
    );
     */
    private Integer idAlmacen;
    private String tipoAlmacen;
    private String direccionAlmacen ;

    public AlmacenDto(Integer idAlmacen, String tipoAlmacen, String direccionAlmacen) {
        this.idAlmacen = idAlmacen;
        this.tipoAlmacen = tipoAlmacen;
        this.direccionAlmacen = direccionAlmacen;
    }

    public AlmacenDto() {
    }
}
