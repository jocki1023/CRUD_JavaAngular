package com.CRUD.ejemplo01.Controller;


import com.CRUD.ejemplo01.Componente.ActividadUsuarioComponent;
import com.CRUD.ejemplo01.Entity.ActividadUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/actividadUsuario"})
public class ControladorActividadUsuario {

    @Autowired
    ActividadUsuarioComponent actividadUsuarioComponent;

    @GetMapping
    public List<ActividadUsuario> listar(){

        return actividadUsuarioComponent.listar();
    }
}
