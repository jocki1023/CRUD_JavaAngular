package com.CRUD.ejemplo01.Componente;

import com.CRUD.ejemplo01.Entity.EstadosActividad;

import java.util.List;

public interface EstadosActividadComponent {

    List<EstadosActividad> listar();

    EstadosActividad listarId(String id);
    EstadosActividad add(EstadosActividad p);
    EstadosActividad edit(EstadosActividad p);
    EstadosActividad delete(int id);


}

