package com.backend.backend.servicio.Implementacion;

import com.backend.backend.dao.UsuarioDao;
import com.backend.backend.dto.UsuarioDto;
import com.backend.backend.servicio.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioUsuarioImpl implements ServicioUsuario {
    @Autowired
    UsuarioDao dao;

    @Override
    public UsuarioDto mostrarUsuarioResponsable() {
        return dao.mostrarUsuarioResponsable();
    }


}

