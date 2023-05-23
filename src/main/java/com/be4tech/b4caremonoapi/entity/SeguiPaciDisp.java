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
@Table(name = "segui_paci_disp")
@Entity
public class SeguiPaciDisp {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "crisis")
    private String crisis;

    @Column(name = "diagnostico_vns")
    private String diagnosticoVns;

    @Column(name = "encargado_id")
    private String encargado;

    @Column(name = "hospi_crisis")
    private String hospiCrisis;

    @Column(name = "instant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date instant;

    @Column(name = "medicamento_vns")
    private String medicamentoVns;

    @JoinColumn(name = "paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    @Column(name = "porcentaje_reduccion_medicamento")
    private String porcentajeReduccionMedicamento;

    @Column(name = "reduc_medicacion")
    private Boolean reducMedicacion;

    @Column(name = "status")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getReducMedicacion() {
        return reducMedicacion;
    }

    public void setReducMedicacion(Boolean reducMedicacion) {
        this.reducMedicacion = reducMedicacion;
    }

    public String getPorcentajeReduccionMedicamento() {
        return porcentajeReduccionMedicamento;
    }

    public void setPorcentajeReduccionMedicamento(String porcentajeReduccionMedicamento) {
        this.porcentajeReduccionMedicamento = porcentajeReduccionMedicamento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getMedicamentoVns() {
        return medicamentoVns;
    }

    public void setMedicamentoVns(String medicamentoVns) {
        this.medicamentoVns = medicamentoVns;
    }

    public Date getInstant() {
        return instant;
    }

    public void setInstant(Date instant) {
        this.instant = instant;
    }

    public String getHospiCrisis() {
        return hospiCrisis;
    }

    public void setHospiCrisis(String hospiCrisis) {
        this.hospiCrisis = hospiCrisis;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getDiagnosticoVns() {
        return diagnosticoVns;
    }

    public void setDiagnosticoVns(String diagnosticoVns) {
        this.diagnosticoVns = diagnosticoVns;
    }

    public String getCrisis() {
        return crisis;
    }

    public void setCrisis(String crisis) {
        this.crisis = crisis;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}