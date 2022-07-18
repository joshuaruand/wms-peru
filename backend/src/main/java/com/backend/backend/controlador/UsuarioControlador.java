package com.backend.backend.controlador;

import com.backend.backend.dto.UsuarioDto;
import com.backend.backend.servicio.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class UsuarioControlador {
    @Autowired
    private ServicioUsuario service;
    @RequestMapping(
            value = "/mostrarUsuarioResponsable",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    UsuarioDto mostrarUsuarioResponsable() {
        return service.mostrarUsuarioResponsable();
    }

}