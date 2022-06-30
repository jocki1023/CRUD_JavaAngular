package com.CRUD.ejemplo01.Service;

import com.CRUD.ejemplo01.Componente.ActividadUsuarioComponent;
import com.CRUD.ejemplo01.Entity.ActividadUsuario;
import com.CRUD.ejemplo01.Repository.ActividadUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadUsuarioServiceImp implements ActividadUsuarioComponent {

    @Autowired
    private ActividadUsuarioRepositorio actividadUsuario;

    @Override
    public List<ActividadUsuario> listar() {
        return actividadUsuario.findAll();
    }

    @Override
    public ActividadUsuario listarId(String id) {
        return null;
    }

    @Override
    public ActividadUsuario add(ActividadUsuario p) {
        return null;
    }

    @Override
    public ActividadUsuario edit(ActividadUsuario p) {
        return null;
    }

    @Override
    public ActividadUsuario delete(int id) {
        return null;
    }


}
