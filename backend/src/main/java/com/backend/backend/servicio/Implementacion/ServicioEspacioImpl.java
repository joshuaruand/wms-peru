package com.backend.backend.servicio.Implementacion;

import com.backend.backend.dao.EspacioDao;
import com.backend.backend.dto.EspaciosDto;
import com.backend.backend.dto.EstantesDto;
import com.backend.backend.servicio.ServicioEspacio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServicioEspacioImpl implements ServicioEspacio {
    @Autowired
    EspacioDao dao;
    @Override
    public List<EspaciosDto> RespuestaEspacios(EstantesDto estante) {
        return dao.RespuestaEspacios(estante) ;
    }
}

