package com.backend.backend.dto.rest;

import com.backend.backend.dto.OrdenesRecepcionDetalladoDto;
import lombok.Data;

import java.util.List;

@Data
public class RptaOrdenesRecepcionDetallado {
    private List<OrdenesRecepcionDetalladoDto> detalle;
}
