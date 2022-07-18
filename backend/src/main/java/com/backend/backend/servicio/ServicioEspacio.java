package com.backend.backend.servicio;

import com.backend.backend.dto.EspaciosDto;
import com.backend.backend.dto.EstantesDto;

import java.util.List;

public interface ServicioEspacio {
    List<EspaciosDto> RespuestaEspacios(EstantesDto estante);
}
