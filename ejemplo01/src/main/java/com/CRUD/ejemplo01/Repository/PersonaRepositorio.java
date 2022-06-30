package com.CRUD.ejemplo01.Repository;

import com.CRUD.ejemplo01.Entity.Persona;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonaRepositorio extends Repository <Persona, Integer> {

List<Persona>findAll();
//Persona findById(String id);
Persona save(Persona p);
void delete(Persona p);

}
