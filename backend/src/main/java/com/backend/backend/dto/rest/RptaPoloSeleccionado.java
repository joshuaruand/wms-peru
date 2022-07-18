package com.backend.backend.dto.rest;

import com.backend.backend.dto.PoloSeleccionadoDto;
import lombok.Data;

import java.util.List;

@Data
public class RptaPoloSeleccionado {
    private List<PoloSeleccionadoDto> bienesSeleccionados;
}
