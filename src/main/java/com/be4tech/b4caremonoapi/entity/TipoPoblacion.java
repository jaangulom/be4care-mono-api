package com.be4tech.b4caremonoapi.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Store(name = "b4mono")
@Table(name = "tipo_poblacion")
@Entity
public class TipoPoblacion {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "estado")
    private Boolean estado;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "time_instant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeInstant;

    @Column(name = "update_intant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateIntant;

    public Date getUpdateIntant() {
        return updateIntant;
    }

    public void setUpdateIntant(Date updateIntant) {
        this.updateIntant = updateIntant;
    }

    public Date getTimeInstant() {
        return timeInstant;
    }

    public void setTimeInstant(Date timeInstant) {
        this.timeInstant = timeInstant;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}