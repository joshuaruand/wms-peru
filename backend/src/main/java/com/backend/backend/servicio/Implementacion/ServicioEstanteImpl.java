package com.backend.backend.servicio.Implementacion;

import com.backend.backend.dao.EstanteDao;
import com.backend.backend.dto.CabeceraEstanteDto;
import com.backend.backend.dto.EstantesDto;
import com.backend.backend.servicio.ServicioEstante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServicioEstanteImpl implements ServicioEstante {
        @Autowired
        EstanteDao dao;

        @Override
        public List<EstantesDto> obtenerGrillaEstantes() {
                return dao.obtenerGrillaEstantes();
        }

        @Override
        public CabeceraEstanteDto obtenerCabeceraEstante(EstantesDto estante) {
                return dao.obtenerCabeceraEstante(estante);
        }
}
