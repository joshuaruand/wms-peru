package com.backend.backend.controlador;

import com.backend.backend.dto.EstantesDto;
import com.backend.backend.dto.rest.RptaEspacios;
import com.backend.backend.servicio.ServicioEspacio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class EspacioControlador {
    @Autowired
    private ServicioEspacio service;
    @RequestMapping(
            value = "/obtenerGrillaEspacios",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    RptaEspacios obtenerGrillaEspacios(@RequestBody EstantesDto estante){
        RptaEspacios rpta = new RptaEspacios();
        rpta.setGrillaEspacios(service.RespuestaEspacios(estante));
        return rpta;
    }
}
