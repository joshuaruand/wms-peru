package com.backend.backend.dao;

import com.backend.backend.dto.CabeceraBienesLugarDto;
import com.backend.backend.dto.EspaciosDto;
import com.backend.backend.dto.EstantesDto;

import java.util.List;

public interface EspacioDao {
    List<EspaciosDto> RespuestaEspacios(EstantesDto estante);

    CabeceraBienesLugarDto obtenerCabeceraBienesLugar(EspaciosDto espacio);
}

