package com.backend.backend.servicio.Implementacion;

import com.backend.backend.dao.EspacioDao;
import com.backend.backend.dto.CabeceraBienesLugarDto;
import com.backend.backend.dto.EspaciosDto;
import com.backend.backend.servicio.ServicioBienesLugar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioBienesLugarImpl implements ServicioBienesLugar {
    @Autowired
    EspacioDao dao;
    @Override
    public CabeceraBienesLugarDto obtenerCabeceraBienesLugar(EspaciosDto espacio) {
        return dao.obtenerCabeceraBienesLugar(espacio);
    }
}
