package com.be4tech.b4caremonoapi.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;
import io.jmix.data.DdlGeneration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Store(name = "b4mono")
@Table(name = "comple_terapeutica")
@Entity
public class CompleTerapeutica {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "estado_ct")
    private Boolean estadoCt;

    @Column(name = "nombre_ct")
    private String nombreCt;

    public String getNombreCt() {
        return nombreCt;
    }

    public void setNombreCt(String nombreCt) {
        this.nombreCt = nombreCt;
    }

    public Boolean getEstadoCt() {
        return estadoCt;
    }

    public void setEstadoCt(Boolean estadoCt) {
        this.estadoCt = estadoCt;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}