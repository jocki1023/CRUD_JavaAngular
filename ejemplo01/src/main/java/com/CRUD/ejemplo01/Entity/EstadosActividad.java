package com.CRUD.ejemplo01.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADOS_ACTIVIDAD")
public class EstadosActividad {

    @Id
    @Column(name = "id_estado_actividad")
    private Integer idEstadoActividad;

    private String estado;


    public Integer getIdEstadoActividad() {
        return idEstadoActividad;
    }

    public void setIdEstadoActividad(Integer idEstadoActividad) {
        this.idEstadoActividad = idEstadoActividad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}


