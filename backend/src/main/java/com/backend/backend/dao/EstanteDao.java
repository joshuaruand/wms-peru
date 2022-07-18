package com.backend.backend.dao;

import com.backend.backend.dto.CabeceraEstanteDto;
import com.backend.backend.dto.EstantesDto;

import java.util.List;

public interface EstanteDao {
    List<EstantesDto> obtenerGrillaEstantes();

    CabeceraEstanteDto obtenerCabeceraEstante(EstantesDto estante);
}
