package com.backend.backend.dto.rest;

import com.backend.backend.dto.EspaciosDto;
import lombok.Data;

import java.util.List;
@Data
public class RptaEspacios {
    private List<EspaciosDto> grillaEspacios;
}
