package com.backend.backend.dto.rest;

import com.backend.backend.dto.PaquetesDto;
import lombok.Data;

import java.util.List;

@Data
public class RptaPaquetesaUbicar {
    private List<PaquetesDto> paquetes;
}
