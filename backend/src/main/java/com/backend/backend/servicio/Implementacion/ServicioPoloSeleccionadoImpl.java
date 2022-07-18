package com.backend.backend.servicio.Implementacion;

import com.backend.backend.dao.PoloSeleccionadoDao;
import com.backend.backend.dto.PoloSeleccionadoDto;
import com.backend.backend.servicio.ServicioPoloSeleccionado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServicioPoloSeleccionadoImpl implements ServicioPoloSeleccionado {
    @Autowired
    PoloSeleccionadoDao dao;

    @Override
    public List<PoloSeleccionadoDto> seleccionBienes() {
        return dao.seleccionBienes();
    }
}
