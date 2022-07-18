package com.backend.backend.controlador;

import com.backend.backend.dto.rest.RptaPoloSeleccionado;
import com.backend.backend.servicio.ServicioPoloSeleccionado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class PoloSeleccionadoControlador {
    @Autowired
    private ServicioPoloSeleccionado service;
    @RequestMapping(
            value = "/seleccionBienes",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    RptaPoloSeleccionado seleccionBienes(){
        RptaPoloSeleccionado rpta = new RptaPoloSeleccionado();
        rpta.setBienesSeleccionados(service.seleccionBienes());
        return rpta;
    }
}
