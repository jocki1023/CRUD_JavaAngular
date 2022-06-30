package com.CRUD.ejemplo01.Controller;


import com.CRUD.ejemplo01.Componente.ActividadComponent;
import com.CRUD.ejemplo01.Entity.Actividades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/actividades"})
public class ControladorActividades {


    @Autowired
    ActividadComponent actividadComponent;

    @GetMapping
    public List<Actividades> listar(){

        return actividadComponent.listar();
    }

    @PostMapping
    public Actividades agregar(@RequestBody Actividades a){
        return actividadComponent.add(a);
    }

}
