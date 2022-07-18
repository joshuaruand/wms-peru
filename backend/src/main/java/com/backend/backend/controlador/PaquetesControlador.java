package com.backend.backend.controlador;

import com.backend.backend.dto.EspaciosDto;
import com.backend.backend.dto.UbicarPaqueteDto;
import com.backend.backend.dto.rest.RptaPaquetesUbicados;
import com.backend.backend.servicio.ServicioPaquetes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class PaquetesControlador {
    @Autowired
    private ServicioPaquetes service;

    @RequestMapping(
            value = "/obtenerPaquetesUbicados",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public RptaPaquetesUbicados obtenerPaquetesUbicados(@RequestBody EspaciosDto espacio) {
        RptaPaquetesUbicados rpta = new RptaPaquetesUbicados();
        rpta.setPaquetesUbicados(service.obtenerPaquetesUbicados(espacio));
        return rpta;
    }

    @RequestMapping(
            value = "/ubicarPaquetes",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public UbicarPaqueteDto ubicarPaquetes(@RequestBody UbicarPaqueteDto paquete) {
        return service.ubicarPaquetes(paquete);

    }

    @RequestMapping(
            value = "/obtenerPaquetesaUbicar",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody RptaPaquetesUbicados obtenerPaquetesaUbicar() {
        RptaPaquetesUbicados rpta = new RptaPaquetesUbicados();
        rpta.setPaquetesUbicados(service.obtenerPaquetesaUbicar());
        return rpta;
    }
}

