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
@Table(name = "tratamiento_medicamento")
@Entity
public class TratamientoMedicamento {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "dosis")
    private String dosis;

    @Column(name = "dosis_administrada")
    private String dosisAdministrada;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "intensidad")
    private String intensidad;

    @JoinColumn(name = "medicamento_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Medicamento medicamento;

    @JoinColumn(name = "tratamiento_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Tratamiento tratamiento;

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public String getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDosisAdministrada() {
        return dosisAdministrada;
    }

    public void setDosisAdministrada(String dosisAdministrada) {
        this.dosisAdministrada = dosisAdministrada;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}