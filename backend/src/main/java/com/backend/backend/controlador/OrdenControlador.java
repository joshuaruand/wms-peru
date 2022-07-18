package com.backend.backend.controlador;

import com.backend.backend.dto.CitaDto;
import com.backend.backend.dto.OrdenDto;
import com.backend.backend.dto.rest.RptaOrdenesRecepcion;
import com.backend.backend.dto.rest.RptaOrdenesRecepcionDetallado;
import com.backend.backend.servicio.ServicioOrden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class OrdenControlador {
    @Autowired
    private ServicioOrden service;
    @RequestMapping(
            value = "/obtenerIdOrdenPorIdCita",
            method = RequestMethod.POST,
            consumes = "application/json;charset=utf-8",
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    OrdenDto obtenerIdOrdenPorIdCita (@RequestBody CitaDto cita) {
        if (cita.getIdCita() == null ){
            return new OrdenDto();}else{
            return service.obtenerIdOrdenPorIdCita(cita);}
    }
    @RequestMapping(
            value = "/actualizarFechaHoraOrden",
            method = RequestMethod.PUT,
            consumes = "application/json;charset=utf-8",
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody OrdenDto actualizarFechaHoraOrden(@RequestBody OrdenDto orden){
        return service.actualizarFechaHoraOrden(orden);
    }
    @RequestMapping(
            value = "/obtenerOrdenesRecepcion",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    RptaOrdenesRecepcion obtenerOrdenesRecepcion(){
        RptaOrdenesRecepcion rpta = new RptaOrdenesRecepcion();
        rpta.setLista(service.obtenerOrdenesRecepcion());
        return rpta;
    }
    @RequestMapping(
            value = "/obtenerOrdenesRecepcionDetallado",
            method = RequestMethod.POST,
            produces= "application/json;charset=utf-8"
    )
    public RptaOrdenesRecepcionDetallado obtenerOrdenesRecepcionDetallado(@RequestBody OrdenDto orden){
        RptaOrdenesRecepcionDetallado rpta = new RptaOrdenesRecepcionDetallado();
        rpta.setDetalle(service.obtenerOrdenesRecepcionDetallado(orden));
        return rpta;
    }
}


