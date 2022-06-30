package com.CRUD.ejemplo01.Repository;

import com.CRUD.ejemplo01.Entity.Actividades;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ActividadRepositorio extends Repository<Actividades, Integer> {

    List<Actividades> findAll();
    //Persona findById(String id);
    Actividades save(Actividades p);
    void delete(Actividades p);

}
