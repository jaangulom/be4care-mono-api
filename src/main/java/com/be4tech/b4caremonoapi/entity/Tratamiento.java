package com.be4tech.b4caremonoapi.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.util.UUID;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Store(name = "b4mono")
@Table(name = "tratamiento")
@Entity
public class Tratamiento {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "descripcion_tratamiento")
    @Lob
    private String descripcionTratamiento;

    @Column(name = "duracion_tratamiento")
    private Integer duracionTratamiento;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "informacion_tratamiento")
    @Lob
    private String informacionTratamiento;

    @Column(name = "nombre")
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInformacionTratamiento() {
        return informacionTratamiento;
    }

    public void setInformacionTratamiento(String informacionTratamiento) {
        this.informacionTratamiento = informacionTratamiento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getDuracionTratamiento() {
        return duracionTratamiento;
    }

    public void setDuracionTratamiento(Integer duracionTratamiento) {
        this.duracionTratamiento = duracionTratamiento;
    }

    public String getDescripcionTratamiento() {
        return descripcionTratamiento;
    }

    public void setDescripcionTratamiento(String descripcionTratamiento) {
        this.descripcionTratamiento = descripcionTratamiento;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}