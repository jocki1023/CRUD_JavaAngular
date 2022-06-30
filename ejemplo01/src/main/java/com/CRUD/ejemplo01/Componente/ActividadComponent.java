package com.CRUD.ejemplo01.Componente;

import com.CRUD.ejemplo01.Entity.Actividades;


import java.util.List;

public interface ActividadComponent {

    List<Actividades> listar();

    Actividades listarId(String id);
    Actividades add(Actividades p);
    Actividades edit(Actividades p);
    Actividades delete(int id);
}
