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
@Table(name = "componentes")
@Entity
public class Componente {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "descripcion")
    @Lob
    private String descripcion;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "estado_componente")
    private Boolean estadoComponente;

    @Column(name = "tipo_componente")
    private String tipoComponente;

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public Boolean getEstadoComponente() {
        return estadoComponente;
    }

    public void setEstadoComponente(Boolean estadoComponente) {
        this.estadoComponente = estadoComponente;
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