package com.backend.backend.servicio.Implementacion;

import com.backend.backend.dao.MovMercaderiaDao;
import com.backend.backend.dto.MovMercaderiaDto;
import com.backend.backend.servicio.ServicioMovMercaderia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioMovMercaderiaImpl implements ServicioMovMercaderia {
    @Autowired
    MovMercaderiaDao dao;

    @Override
    public MovMercaderiaDto creacionMovimientoEntrada(MovMercaderiaDto movimiento) {
        return dao.creacionMovimientoEntrada(movimiento);
    }
}
