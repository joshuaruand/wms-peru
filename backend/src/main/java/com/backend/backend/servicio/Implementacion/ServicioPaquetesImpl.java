package com.backend.backend.servicio.Implementacion;

import com.backend.backend.dao.PaquetesDao;
import com.backend.backend.dto.EspaciosDto;
import com.backend.backend.dto.PaquetesDto;
import com.backend.backend.dto.UbicarPaqueteDto;
import com.backend.backend.servicio.ServicioPaquetes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServicioPaquetesImpl implements ServicioPaquetes {
    @Autowired
    PaquetesDao dao;
    @Override
    public List<PaquetesDto> obtenerPaquetesUbicados(EspaciosDto espacio) {
        return dao.obtenerPaquetesUbicados(espacio) ;
    }

    @Override
    public UbicarPaqueteDto ubicarPaquetes(UbicarPaqueteDto paquete) {
        return dao.ubicarPaquetes(paquete) ;
    }

    @Override
    public List<PaquetesDto> obtenerPaquetesaUbicar() {
        return dao.obtenerPaquetesaUbicar();
    }
}
