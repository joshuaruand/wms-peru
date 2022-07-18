package com.backend.backend.dao;

import com.backend.backend.dto.CitaDto;
import com.backend.backend.dto.CodigoCitaDto;

import java.util.List;


public interface CitaDao {

    List<CodigoCitaDto> obtenerIdCitasRecepcion();

    CitaDto verificarCitaProgramada(CitaDto cita);
}

