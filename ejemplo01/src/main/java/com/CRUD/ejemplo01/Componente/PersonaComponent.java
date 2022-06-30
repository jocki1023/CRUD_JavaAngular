package com.CRUD.ejemplo01.Componente;

import com.CRUD.ejemplo01.Entity.Persona;

import java.util.List;

public interface PersonaComponent {

    List<Persona>listar();

    Persona listarId(String id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);
}
