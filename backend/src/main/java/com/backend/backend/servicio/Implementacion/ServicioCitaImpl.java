package com.backend.backend.servicio.Implementacion;

import com.backend.backend.dao.CitaDao;
import com.backend.backend.dto.CitaDto;
import com.backend.backend.dto.CodigoCitaDto;
import com.backend.backend.servicio.ServicioCita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServicioCitaImpl implements ServicioCita {
    @Autowired
    CitaDao dao;
    @Override
    public List<CodigoCitaDto> obtenerIdCitasRecepcion() {
        return dao.obtenerIdCitasRecepcion();
    }

    @Override
    public CitaDto verificarCitaProgramada(CitaDto cita) {
        return dao.verificarCitaProgramada(cita);
    }

}
