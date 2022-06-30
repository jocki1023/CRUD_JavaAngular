package com.CRUD.ejemplo01.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actividad_usuario")
public class ActividadUsuario {

    @Id
    @Column(name ="id")
    private Integer idUser;


    @Column(name = "id_actividad")
    private Integer idActividad;


    @Column(name ="id_usuario")
    private Integer idUsuario;


    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }


    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
