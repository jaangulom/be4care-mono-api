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
@Table(name = "area_encargado")
@Entity
public class AreaEncargado {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "area_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Area area;

    @Column(name = "empresa_id")
    private String empresa;

    @JoinColumn(name = "encargado_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Encargado encargado;

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}