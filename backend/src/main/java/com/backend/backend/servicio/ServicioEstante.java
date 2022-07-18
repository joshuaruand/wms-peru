package com.backend.backend.servicio;

import com.backend.backend.dto.CabeceraEstanteDto;
import com.backend.backend.dto.EstantesDto;

import java.util.List;

public interface ServicioEstante {
    List<EstantesDto> obtenerGrillaEstantes();

    CabeceraEstanteDto obtenerCabeceraEstante(EstantesDto estante);
}
