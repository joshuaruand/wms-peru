package com.backend.backend.controlador;

import com.backend.backend.dto.AlmacenDto;
import com.backend.backend.servicio.ServicioAlmacen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class AlmacenControlador {
    @Autowired
    private ServicioAlmacen service;
    @RequestMapping(
            value = "/obtenerInfoAlmacen",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    AlmacenDto obtenerInfoAlmacen(){
        return service.obtenerInfoAlmacen();
    }
}

