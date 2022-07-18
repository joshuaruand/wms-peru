package com.backend.backend.servicio;

import com.backend.backend.dto.CabeceraBienesLugarDto;
import com.backend.backend.dto.EspaciosDto;

public interface ServicioBienesLugar {
    CabeceraBienesLugarDto obtenerCabeceraBienesLugar(EspaciosDto espacio);
}
