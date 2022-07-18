package com.backend.backend.servicio;

import com.backend.backend.dto.CitaDto;
import com.backend.backend.dto.CodigoCitaDto;

import java.util.List;

public interface ServicioCita {
    List<CodigoCitaDto> obtenerIdCitasRecepcion();
    CitaDto verificarCitaProgramada(CitaDto cita);
}
