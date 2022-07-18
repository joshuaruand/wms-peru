package com.backend.backend.dao;


import com.backend.backend.dto.EspaciosDto;
import com.backend.backend.dto.PaquetesDto;
import com.backend.backend.dto.UbicarPaqueteDto;

import java.util.List;

public interface PaquetesDao {
    List<PaquetesDto> obtenerPaquetesUbicados(EspaciosDto espacio);

    UbicarPaqueteDto ubicarPaquetes(UbicarPaqueteDto paquete);

    List<PaquetesDto> obtenerPaquetesaUbicar();
}
