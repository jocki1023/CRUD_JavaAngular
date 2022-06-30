package com.CRUD.ejemplo01.Repository;



import com.CRUD.ejemplo01.Entity.EstadosActividad;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface EstadosActividadRepository extends Repository<EstadosActividad, Integer> {

    List<EstadosActividad> findAll();
    //Persona findById(String id);
    EstadosActividad save(EstadosActividad p);
    void delete(EstadosActividad p);

}
