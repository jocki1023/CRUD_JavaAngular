package com.CRUD.ejemplo01.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

@Entity
@Table(name = "ACTIVIDADES")
public class Actividades {

    @Id
    @Column(name = "id_actividad")
    private Integer idActividad;

    @Column(name = "nombre_actividad")
    private String nombreActividad;

    @Column(name = "id_estado_actividad")
    private Integer idEstadoActividad;

    @Column(name = "fecha_inicio_actividad")
    private Date fechaInicioActividad;

    @Column(name = "id_usuario")
    private Integer idusuario;

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public Integer getIdEstadoActividad() {
        return idEstadoActividad;
    }

    public void setIdEstadoActividad(Integer idEstadoActividad) {
        this.idEstadoActividad = idEstadoActividad;
    }

    public Date getFechaInicioActividad() {
        return fechaInicioActividad;
    }

    public void setFechaInicioActividad(Date fechaInicioActividad) {
        this.fechaInicioActividad = fechaInicioActividad;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
}
