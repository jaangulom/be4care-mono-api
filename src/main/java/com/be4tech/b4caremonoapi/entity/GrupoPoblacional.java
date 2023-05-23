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
@Table(name = "grupo_poblacional")
@Entity
public class GrupoPoblacional {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "empresa_id")
    private String empresa;

    @JoinColumn(name = "paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    @Column(name = "time_instant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeInstant;

    @JoinColumn(name = "tipo_poblacion_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoPoblacion tipoPoblacion;

    @Column(name = "update_intant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateIntant;

    public Date getUpdateIntant() {
        return updateIntant;
    }

    public void setUpdateIntant(Date updateIntant) {
        this.updateIntant = updateIntant;
    }

    public TipoPoblacion getTipoPoblacion() {
        return tipoPoblacion;
    }

    public void setTipoPoblacion(TipoPoblacion tipoPoblacion) {
        this.tipoPoblacion = tipoPoblacion;
    }

    public Date getTimeInstant() {
        return timeInstant;
    }

    public void setTimeInstant(Date timeInstant) {
        this.timeInstant = timeInstant;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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