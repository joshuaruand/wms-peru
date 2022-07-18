package com.backend.backend.controlador;

import com.backend.backend.dto.CabeceraBienesLugarDto;
import com.backend.backend.dto.EspaciosDto;
import com.backend.backend.servicio.ServicioBienesLugar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class BienesLugarControlador {
    @Autowired
    private ServicioBienesLugar service;
    @RequestMapping(
            value = "/obtenerCabeceraBienesLugar",
            method = RequestMethod.POST,
            consumes = "application/json;charset=utf-8",
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    CabeceraBienesLugarDto obtenerCabeceraBienesLugar(@RequestBody EspaciosDto espacio){
        return service.obtenerCabeceraBienesLugar((espacio));
    }
}
