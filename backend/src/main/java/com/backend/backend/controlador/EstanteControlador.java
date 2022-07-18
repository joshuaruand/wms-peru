package com.backend.backend.controlador;

import com.backend.backend.dto.CabeceraEstanteDto;
import com.backend.backend.dto.EstantesDto;
import com.backend.backend.dto.rest.RptaEstante;
import com.backend.backend.servicio.ServicioEstante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class EstanteControlador {
    @Autowired
    private ServicioEstante service;
    @RequestMapping(
            value = "/obtenerGrillaEstantes",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    RptaEstante obtenerGrillaEstantes(){
        RptaEstante rpta = new RptaEstante();
        rpta.setGrillaEstantes(service.obtenerGrillaEstantes());
        return rpta;
    }
    @RequestMapping(
            value = "/obtenerCabeceraEstante",
            method = RequestMethod.POST,
            consumes = "application/json;charset=utf-8",
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    CabeceraEstanteDto obtenerCabeceraEstante(@RequestBody EstantesDto estante){
        return service.obtenerCabeceraEstante(estante);
    }
}
