package com.backend.backend.servicio.Implementacion;

import com.backend.backend.dao.AlmacenDao;
import com.backend.backend.dto.AlmacenDto;
import com.backend.backend.servicio.ServicioAlmacen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioAlmacenImpl implements ServicioAlmacen {
    @Autowired
    AlmacenDao dao;
    @Override
    public AlmacenDto obtenerInfoAlmacen() {
        return dao.obtenerInfoAlmacen();
    }
}

