package com.backend.backend.dto.rest;

import com.backend.backend.dto.EstantesDto;
import lombok.Data;

import java.util.List;

@Data
public class RptaEstante {
    private List<EstantesDto> grillaEstantes;
}
