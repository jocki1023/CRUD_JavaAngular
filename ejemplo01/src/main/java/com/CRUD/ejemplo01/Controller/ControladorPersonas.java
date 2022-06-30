package com.CRUD.ejemplo01.Controller;

import com.CRUD.ejemplo01.Entity.Persona;
import com.CRUD.ejemplo01.Componente.PersonaComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class ControladorPersonas {

    @Autowired
    PersonaComponent service;


    @GetMapping
    public List<Persona>listar(){
        return service.listar();
    }

    @PostMapping
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    }



}
