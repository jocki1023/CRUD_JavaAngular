package com.CRUD.ejemplo01.Service;


import com.CRUD.ejemplo01.Componente.ActividadComponent;
import com.CRUD.ejemplo01.Entity.Actividades;
import com.CRUD.ejemplo01.Repository.ActividadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadServiceImp implements ActividadComponent {


    @Autowired
    private ActividadRepositorio actividadRepositorio;


    @Override
    public List<Actividades> listar() {
        return actividadRepositorio.findAll();
    }

    @Override
    public Actividades listarId(String id) {
        return null;
    }

    @Override
    public Actividades add(Actividades p) {
        return actividadRepositorio.save(p);
    }

    @Override
    public Actividades edit(Actividades p) {
        return null;
    }

    @Override
    public Actividades delete(int id) {
        return null;
    }
}
