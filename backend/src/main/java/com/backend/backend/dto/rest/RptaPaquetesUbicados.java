package com.backend.backend.dto.rest;

import com.backend.backend.dto.PaquetesDto;
import lombok.Data;

import java.util.List;

@Data
public class RptaPaquetesUbicados {
    private List<PaquetesDto> paquetesUbicados;
}
