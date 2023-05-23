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
@Table(name = "agenda_extra")
@Entity
public class AgendaExtra {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "hora_programada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaProgramada;

    @Column(name = "hora_real")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaReal;

    @Column(name = "intensidad")
    private Integer intensidad;

    @JoinColumn(name = "medicamento_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Medicamento medicamento;

    @Column(name = "nom_med_extra")
    private String nomMedExtra;

    @Column(name = "time_instant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeInstant;

    public Date getTimeInstant() {
        return timeInstant;
    }

    public void setTimeInstant(Date timeInstant) {
        this.timeInstant = timeInstant;
    }

    public String getNomMedExtra() {
        return nomMedExtra;
    }

    public void setNomMedExtra(String nomMedExtra) {
        this.nomMedExtra = nomMedExtra;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Integer getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(Integer intensidad) {
        this.intensidad = intensidad;
    }

    public Date getHoraReal() {
        return horaReal;
    }

    public void setHoraReal(Date horaReal) {
        this.horaReal = horaReal;
    }

    public Date getHoraProgramada() {
        return horaProgramada;
    }

    public void setHoraProgramada(Date horaProgramada) {
        this.horaProgramada = horaProgramada;
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}