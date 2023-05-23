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
@Table(name = "antecedentes_ginecologicos")
@Entity
public class AntecedentesGinecologico {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "ciclo_mestrual")
    private String cicloMestrual;

    @Column(name = "duracion")
    private Integer duracion;

    @Column(name = "embarazo")
    private Boolean embarazo;

    @Column(name = "embarazos_previos")
    private Integer embarazosPrevios;

    @Column(name = "empresa_id")
    @Lob
    private String empresa;

    @Column(name = "f_um")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fUm;

    @Column(name = "frecuencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date frecuencia;

    @JoinColumn(name = "historia_clinica_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private HistoriaClinica historiaClinica;

    @Column(name = "menarca")
    private Integer menarca;

    @Column(name = "menopausia")
    private Integer menopausia;

    @Column(name = "observacion")
    private String observacion;

    @Column(name = "observaciones_ginecob")
    private String observacionesGinecob;

    @JoinColumn(name = "paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    @Column(name = "planifica")
    private Boolean planifica;

    @Column(name = "resultado_mamo")
    private String resultadoMamo;

    @Column(name = "time_instant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeInstant;

    @Column(name = "ultima_mamografia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaMamografia;

    @Column(name = "update_intant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateIntant;

    public Date getUpdateIntant() {
        return updateIntant;
    }

    public void setUpdateIntant(Date updateIntant) {
        this.updateIntant = updateIntant;
    }

    public Date getUltimaMamografia() {
        return ultimaMamografia;
    }

    public void setUltimaMamografia(Date ultimaMamografia) {
        this.ultimaMamografia = ultimaMamografia;
    }

    public Date getTimeInstant() {
        return timeInstant;
    }

    public void setTimeInstant(Date timeInstant) {
        this.timeInstant = timeInstant;
    }

    public String getResultadoMamo() {
        return resultadoMamo;
    }

    public void setResultadoMamo(String resultadoMamo) {
        this.resultadoMamo = resultadoMamo;
    }

    public Boolean getPlanifica() {
        return planifica;
    }

    public void setPlanifica(Boolean planifica) {
        this.planifica = planifica;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getObservacionesGinecob() {
        return observacionesGinecob;
    }

    public void setObservacionesGinecob(String observacionesGinecob) {
        this.observacionesGinecob = observacionesGinecob;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getMenopausia() {
        return menopausia;
    }

    public void setMenopausia(Integer menopausia) {
        this.menopausia = menopausia;
    }

    public Integer getMenarca() {
        return menarca;
    }

    public void setMenarca(Integer menarca) {
        this.menarca = menarca;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public Date getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Date frecuencia) {
        this.frecuencia = frecuencia;
    }

    public Date getFUm() {
        return fUm;
    }

    public void setFUm(Date fUm) {
        this.fUm = fUm;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getEmbarazosPrevios() {
        return embarazosPrevios;
    }

    public void setEmbarazosPrevios(Integer embarazosPrevios) {
        this.embarazosPrevios = embarazosPrevios;
    }

    public Boolean getEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(Boolean embarazo) {
        this.embarazo = embarazo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getCicloMestrual() {
        return cicloMestrual;
    }

    public void setCicloMestrual(String cicloMestrual) {
        this.cicloMestrual = cicloMestrual;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}