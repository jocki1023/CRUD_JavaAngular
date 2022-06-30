package com.CRUD.ejemplo01.Controller;



import com.CRUD.ejemplo01.Entity.EstadosActividad;
import com.CRUD.ejemplo01.Repository.EstadosActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/EstadosActividad"})
public class ControladorEstadosActividad {

    @Autowired
    EstadosActividadRepository estadosActividadRepository;

    @GetMapping
    public List<EstadosActividad> listar(){

        return estadosActividadRepository.findAll();
    }


}
