package com.CRUD.ejemplo01.Service;

import com.CRUD.ejemplo01.Entity.Persona;
import com.CRUD.ejemplo01.Repository.PersonaRepositorio;
import com.CRUD.ejemplo01.Componente.PersonaComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonaServiceImp implements PersonaComponent {

    @Autowired
    private PersonaRepositorio repositorio;

    @Override
    public List<Persona> listar() {
        return repositorio.findAll();

    }

    @Override
    public Persona listarId(String id) {
        return null;//repositorio.findById(id);
    }

    @Override
    public Persona add(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona edit(Persona p) {
        return null;
    }

    @Override
    public Persona delete(int id) {
        return null;
    }
}
