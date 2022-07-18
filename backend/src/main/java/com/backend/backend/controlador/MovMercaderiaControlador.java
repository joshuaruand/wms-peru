package com.backend.backend.controlador;

import com.backend.backend.dto.MovMercaderiaDto;
import com.backend.backend.servicio.ServicioMovMercaderia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class MovMercaderiaControlador {
    @Autowired
    private ServicioMovMercaderia service;
    @RequestMapping(
            value = "/creacionMovimientoEntrada",
            method = RequestMethod.POST,
            consumes = "application/json;charset=utf-8",
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    MovMercaderiaDto creacionMovimientoEntrada(@RequestBody MovMercaderiaDto movimiento) {
        if (movimiento.getIdOrden() == null || movimiento.getIdBien()==null ) {
            return null;
        } else {
            return service.creacionMovimientoEntrada(movimiento);
        }
    }
}
