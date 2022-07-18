package com.backend.backend.dto.rest;

import com.backend.backend.dto.CodigoCitaDto;
import lombok.Data;

import java.util.List;
@Data
public class RptaCodigoCita {
    private List<CodigoCitaDto> codigosRecepcion;
}

