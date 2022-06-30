package com.CRUD.ejemplo01.Service;

import com.CRUD.ejemplo01.Componente.EstadosActividadComponent;
import com.CRUD.ejemplo01.Entity.EstadosActividad;
import com.CRUD.ejemplo01.Repository.EstadosActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoActividadServiceImp implements EstadosActividadComponent {

    @Autowired
    private EstadosActividadRepository estadosActividadRepository;


    @Override
    public List<EstadosActividad> listar() {
        return estadosActividadRepository.findAll();
    }

    @Override
    public EstadosActividad listarId(String id) {
        return null;
    }

    @Override
    public EstadosActividad add(EstadosActividad p) {
        return null;
    }

    @Override
    public EstadosActividad edit(EstadosActividad p) {
        return null;
    }

    @Override
    public EstadosActividad delete(int id) {
        return null;
    }
}
