package com.backend.backend.servicio;

import com.backend.backend.dto.CitaDto;
import com.backend.backend.dto.OrdenDto;
import com.backend.backend.dto.OrdenesRecepcionDetalladoDto;
import com.backend.backend.dto.OrdenesRecepcionDto;

import java.util.List;

public interface ServicioOrden {
    OrdenDto obtenerIdOrdenPorIdCita(CitaDto cita);

    OrdenDto actualizarFechaHoraOrden(OrdenDto orden);

    List<OrdenesRecepcionDto> obtenerOrdenesRecepcion();

    List<OrdenesRecepcionDetalladoDto> obtenerOrdenesRecepcionDetallado(OrdenDto orden);
}
