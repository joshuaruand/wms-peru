package com.backend.backend.servicio.Implementacion;

import com.backend.backend.dao.OrdenDao;
import com.backend.backend.dto.CitaDto;
import com.backend.backend.dto.OrdenDto;
import com.backend.backend.dto.OrdenesRecepcionDetalladoDto;
import com.backend.backend.dto.OrdenesRecepcionDto;
import com.backend.backend.servicio.ServicioOrden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ServicioOrdenImpl implements ServicioOrden {
    @Autowired
    OrdenDao dao;
    @Override
    public OrdenDto obtenerIdOrdenPorIdCita(CitaDto cita) {
        return dao.obtenerIdOrdenPorIdCita(cita);
    }

    @Override
    public OrdenDto actualizarFechaHoraOrden(OrdenDto orden) {
        return dao.actualizarFechaHoraOrden(orden);
    }

    @Override
    public List<OrdenesRecepcionDto> obtenerOrdenesRecepcion() {
        return dao.obtenerOrdenesRecepcion();
    }

    @Override
    public List<OrdenesRecepcionDetalladoDto> obtenerOrdenesRecepcionDetallado(OrdenDto orden) {
        return dao.obtenerOrdenesRecepcionDetallado(orden);
    }
}
