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
@Table(name = "rol")
@Entity
public class Rol {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "permisos")
    @Lob
    private String permisos;

    @Column(name = "tipo_rol")
    private String tipoRol;

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
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