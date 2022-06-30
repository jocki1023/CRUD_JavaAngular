package com.CRUD.ejemplo01.Repository;

import com.CRUD.ejemplo01.Entity.ActividadUsuario;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ActividadUsuarioRepositorio extends Repository<ActividadUsuario, Integer> {

    List<ActividadUsuario> findAll();
    //Persona findById(String id);
    ActividadUsuario save(ActividadUsuario p);
    void delete(ActividadUsuario p);

}
