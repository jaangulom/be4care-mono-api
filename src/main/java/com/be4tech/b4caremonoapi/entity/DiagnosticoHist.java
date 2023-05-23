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
@Table(name = "diagnostico_hist")
@Entity
public class DiagnosticoHist {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "diagnostico_especifico_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticoEspecifico diagnosticoEspecifico;

    @JoinColumn(name = "diagnostico_general_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticoGeneral diagnosticoGeneral;

    @Column(name = "empresa_id")
    private String empresa;

    @JoinColumn(name = "historia_clinica_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private HistoriaClinica historiaClinica;

    @Column(name = "nota_diagnostico")
    @Lob
    private String notaDiagnostico;

    @Column(name = "principal")
    private Boolean principal;

    @Column(name = "secundario")
    private Boolean secundario;

    @Column(name = "time_instant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeInstant;

    @Column(name = "tipo_diagnostico")
    private String tipoDiagnostico;

    @Column(name = "update_intant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateIntant;

    public Date getUpdateIntant() {
        return updateIntant;
    }

    public void setUpdateIntant(Date updateIntant) {
        this.updateIntant = updateIntant;
    }

    public String getTipoDiagnostico() {
        return tipoDiagnostico;
    }

    public void setTipoDiagnostico(String tipoDiagnostico) {
        this.tipoDiagnostico = tipoDiagnostico;
    }

    public Date getTimeInstant() {
        return timeInstant;
    }

    public void setTimeInstant(Date timeInstant) {
        this.timeInstant = timeInstant;
    }

    public Boolean getSecundario() {
        return secundario;
    }

    public void setSecundario(Boolean secundario) {
        this.secundario = secundario;
    }

    public Boolean getPrincipal() {
        return principal;
    }

    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }

    public String getNotaDiagnostico() {
        return notaDiagnostico;
    }

    public void setNotaDiagnostico(String notaDiagnostico) {
        this.notaDiagnostico = notaDiagnostico;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public DiagnosticoGeneral getDiagnosticoGeneral() {
        return diagnosticoGeneral;
    }

    public void setDiagnosticoGeneral(DiagnosticoGeneral diagnosticoGeneral) {
        this.diagnosticoGeneral = diagnosticoGeneral;
    }

    public DiagnosticoEspecifico getDiagnosticoEspecifico() {
        return diagnosticoEspecifico;
    }

    public void setDiagnosticoEspecifico(DiagnosticoEspecifico diagnosticoEspecifico) {
        this.diagnosticoEspecifico = diagnosticoEspecifico;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}