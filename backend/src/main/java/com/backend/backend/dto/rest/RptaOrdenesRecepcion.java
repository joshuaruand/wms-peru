package com.backend.backend.dto.rest;

import com.backend.backend.dto.OrdenesRecepcionDto;
import lombok.Data;

import java.util.List;

@Data
public class RptaOrdenesRecepcion {
    private List<OrdenesRecepcionDto>  lista;
}
