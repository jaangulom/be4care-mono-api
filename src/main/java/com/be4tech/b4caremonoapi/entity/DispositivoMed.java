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
@Table(name = "dispositivo_med")
@Entity
public class DispositivoMed {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "coment_desp_disp")
    private String comentDespDisp;

    @Column(name = "crisis_antes_disp")
    private Integer crisisAntesDisp;

    @Column(name = "crisis_desp_disp")
    private Integer crisisDespDisp;

    @Column(name = "dieta")
    private String dieta;

    @Column(name = "efectos_segund_disp")
    private String efectosSegundDisp;

    @Column(name = "encargado")
    private String encargado;

    @Column(name = "estatus_antes_dips")
    private Integer estatusAntesDips;

    @Column(name = "estatus_desp_disp")
    private Integer estatusDespDisp;

    @Column(name = "fecha_crisis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCrisis;

    @Column(name = "fecha_implantacion_disp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaImplantacionDisp;

    @Column(name = "modelo_disp")
    private String modeloDisp;

    @JoinColumn(name = "paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    @Column(name = "tecnico")
    private String tecnico;

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getModeloDisp() {
        return modeloDisp;
    }

    public void setModeloDisp(String modeloDisp) {
        this.modeloDisp = modeloDisp;
    }

    public Date getFechaImplantacionDisp() {
        return fechaImplantacionDisp;
    }

    public void setFechaImplantacionDisp(Date fechaImplantacionDisp) {
        this.fechaImplantacionDisp = fechaImplantacionDisp;
    }

    public Date getFechaCrisis() {
        return fechaCrisis;
    }

    public void setFechaCrisis(Date fechaCrisis) {
        this.fechaCrisis = fechaCrisis;
    }

    public Integer getEstatusDespDisp() {
        return estatusDespDisp;
    }

    public void setEstatusDespDisp(Integer estatusDespDisp) {
        this.estatusDespDisp = estatusDespDisp;
    }

    public Integer getEstatusAntesDips() {
        return estatusAntesDips;
    }

    public void setEstatusAntesDips(Integer estatusAntesDips) {
        this.estatusAntesDips = estatusAntesDips;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getEfectosSegundDisp() {
        return efectosSegundDisp;
    }

    public void setEfectosSegundDisp(String efectosSegundDisp) {
        this.efectosSegundDisp = efectosSegundDisp;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public Integer getCrisisDespDisp() {
        return crisisDespDisp;
    }

    public void setCrisisDespDisp(Integer crisisDespDisp) {
        this.crisisDespDisp = crisisDespDisp;
    }

    public Integer getCrisisAntesDisp() {
        return crisisAntesDisp;
    }

    public void setCrisisAntesDisp(Integer crisisAntesDisp) {
        this.crisisAntesDisp = crisisAntesDisp;
    }

    public String getComentDespDisp() {
        return comentDespDisp;
    }

    public void setComentDespDisp(String comentDespDisp) {
        this.comentDespDisp = comentDespDisp;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}