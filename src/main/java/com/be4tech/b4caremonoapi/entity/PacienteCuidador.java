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
@Table(name = "paciente_cuidador")
@Entity
public class PacienteCuidador {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "cuidador_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cuidador cuidador;

    @Column(name = "empresa_id")
    private String empresa;

    @JoinColumn(name = "paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

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

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}