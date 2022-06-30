package com.CRUD.ejemplo01.Componente;

import com.CRUD.ejemplo01.Entity.ActividadUsuario;

import java.util.List;

public interface ActividadUsuarioComponent {

    List<ActividadUsuario> listar();

    ActividadUsuario listarId(String id);
    ActividadUsuario add(ActividadUsuario p);
    ActividadUsuario edit(ActividadUsuario p);
    ActividadUsuario delete(int id);


}
