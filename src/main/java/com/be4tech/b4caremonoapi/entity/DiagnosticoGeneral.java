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
@Table(name = "diagnostico_general")
@Entity
public class DiagnosticoGeneral {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "categoria_tres_carac")
    private String categoriaTresCarac;

    @Column(name = "cod_3")
    private String cod3;

    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getCod3() {
        return cod3;
    }

    public void setCod3(String cod3) {
        this.cod3 = cod3;
    }

    public String getCategoriaTresCarac() {
        return categoriaTresCarac;
    }

    public void setCategoriaTresCarac(String categoriaTresCarac) {
        this.categoriaTresCarac = categoriaTresCarac;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}