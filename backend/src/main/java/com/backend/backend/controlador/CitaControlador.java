package com.backend.backend.controlador;

import com.backend.backend.dto.CitaDto;
import com.backend.backend.dto.rest.RptaCodigoCita;
import com.backend.backend.servicio.ServicioCita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class CitaControlador {
    @Autowired
    private ServicioCita service;
    /*
    * select id_cita as "CODIGO DE CITA"
    from cita where tipo_cita = 'recepcion' and id_almacen = 1;
    * */
    @RequestMapping(
            value = "/obtenerIdCitasRecepcion",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    RptaCodigoCita obtenerIdCitasRecepcion() {
        RptaCodigoCita rpta = new RptaCodigoCita();
        rpta.setCodigosRecepcion(service.obtenerIdCitasRecepcion());
        return rpta;
    }
    /*
    * select ci.fecha_cita as "FECHA DE LLEGADA PROGRAMADA", ci.hora_cita as "HORA DE LLEGADA PROGRAMADA",
    ci.documento_cliente as "DNI TRANSPORTISTA", ci.nombre_cliente  as"NOMBRE TRANSPORTISTA"
    from cita ci where ci.id_cita  = ?;
    * */
    @RequestMapping(
            value = "/verificarCitaProgramada",
            method = RequestMethod.POST,
            consumes = "application/json;charset=utf-8",
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody CitaDto verificarCitaProgramada(@RequestBody CitaDto cita) {
        if (cita.getIdCita() == null) {
            return new CitaDto();
        } else {
            return service.verificarCitaProgramada(cita);
        }
    }
}

