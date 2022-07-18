package com.backend.backend.servicio;

import com.backend.backend.dto.EspaciosDto;
import com.backend.backend.dto.PaquetesDto;
import com.backend.backend.dto.UbicarPaqueteDto;

import java.util.List;

public interface ServicioPaquetes {
    List<PaquetesDto> obtenerPaquetesUbicados(EspaciosDto espacio);

    UbicarPaqueteDto ubicarPaquetes(UbicarPaqueteDto paquete);

    List<PaquetesDto> obtenerPaquetesaUbicar();
}

