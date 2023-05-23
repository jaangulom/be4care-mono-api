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
@Table(name = "historia_clinica")
@Entity
public class HistoriaClinica {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "acompanan_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Acompanante acompanan;

    @Column(name = "acompanante")
    private String acompanante;

    @Column(name = "antecedentes_famil")
    private String antecedentesFamil;

    @Column(name = "causa_externa")
    @Lob
    private String causaExterna;

    @Column(name = "centro_atencion")
    @Lob
    private String centroAtencion;

    @JoinColumn(name = "comple_tera_paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CompleTeraPaciente compleTeraPaciente;

    @JoinColumn(name = "cups_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cup cups;

    @JoinColumn(name = "diagnostico_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Diagnostico diagnostico;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "encargado_id")
    private String encargado;

    @Column(name = "enfermedad_actual")
    @Lob
    private String enfermedadActual;

    @Column(name = "estado")
    @Lob
    private String estado;

    @Column(name = "examen_clinico")
    private String examenClinico;

    @JoinColumn(name = "examen_fisico_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ExamenFisico examenFisico;

    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;

    @Column(name = "fecha_inicial")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicial;

    @Column(name = "finalidad_consul")
    @Lob
    private String finalidadConsul;

    @Column(name = "historial_enfermedades")
    private String historialEnfermedades;

    @Column(name = "infiltraciones")
    private String infiltraciones;

    @Column(name = "ips_id")
    private String ips;

    @Column(name = "movito_consulta")
    private String movitoConsulta;

    @Column(name = "notas_analisis_plan")
    @Lob
    private String notasAnalisisPlan;

    @Column(name = "notas_expec_metas")
    @Lob
    private String notasExpecMetas;

    @JoinColumn(name = "paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    @Column(name = "plan")
    @Lob
    private String plan;

    @Column(name = "razon_social")
    private String razonSocial;

    @Column(name = "tipo_atencion")
    @Lob
    private String tipoAtencion;

    @Column(name = "tipo_visita")
    private String tipoVisita;

    @Column(name = "tratamiento_prescrito")
    private String tratamientoPrescrito;

    public String getTratamientoPrescrito() {
        return tratamientoPrescrito;
    }

    public void setTratamientoPrescrito(String tratamientoPrescrito) {
        this.tratamientoPrescrito = tratamientoPrescrito;
    }

    public String getTipoVisita() {
        return tipoVisita;
    }

    public void setTipoVisita(String tipoVisita) {
        this.tipoVisita = tipoVisita;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getNotasExpecMetas() {
        return notasExpecMetas;
    }

    public void setNotasExpecMetas(String notasExpecMetas) {
        this.notasExpecMetas = notasExpecMetas;
    }

    public String getNotasAnalisisPlan() {
        return notasAnalisisPlan;
    }

    public void setNotasAnalisisPlan(String notasAnalisisPlan) {
        this.notasAnalisisPlan = notasAnalisisPlan;
    }

    public String getMovitoConsulta() {
        return movitoConsulta;
    }

    public void setMovitoConsulta(String movitoConsulta) {
        this.movitoConsulta = movitoConsulta;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getInfiltraciones() {
        return infiltraciones;
    }

    public void setInfiltraciones(String infiltraciones) {
        this.infiltraciones = infiltraciones;
    }

    public String getHistorialEnfermedades() {
        return historialEnfermedades;
    }

    public void setHistorialEnfermedades(String historialEnfermedades) {
        this.historialEnfermedades = historialEnfermedades;
    }

    public String getFinalidadConsul() {
        return finalidadConsul;
    }

    public void setFinalidadConsul(String finalidadConsul) {
        this.finalidadConsul = finalidadConsul;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public ExamenFisico getExamenFisico() {
        return examenFisico;
    }

    public void setExamenFisico(ExamenFisico examenFisico) {
        this.examenFisico = examenFisico;
    }

    public String getExamenClinico() {
        return examenClinico;
    }

    public void setExamenClinico(String examenClinico) {
        this.examenClinico = examenClinico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Cup getCups() {
        return cups;
    }

    public void setCups(Cup cups) {
        this.cups = cups;
    }

    public CompleTeraPaciente getCompleTeraPaciente() {
        return compleTeraPaciente;
    }

    public void setCompleTeraPaciente(CompleTeraPaciente compleTeraPaciente) {
        this.compleTeraPaciente = compleTeraPaciente;
    }

    public String getCentroAtencion() {
        return centroAtencion;
    }

    public void setCentroAtencion(String centroAtencion) {
        this.centroAtencion = centroAtencion;
    }

    public String getCausaExterna() {
        return causaExterna;
    }

    public void setCausaExterna(String causaExterna) {
        this.causaExterna = causaExterna;
    }

    public String getAntecedentesFamil() {
        return antecedentesFamil;
    }

    public void setAntecedentesFamil(String antecedentesFamil) {
        this.antecedentesFamil = antecedentesFamil;
    }

    public String getAcompanante() {
        return acompanante;
    }

    public void setAcompanante(String acompanante) {
        this.acompanante = acompanante;
    }

    public Acompanante getAcompanan() {
        return acompanan;
    }

    public void setAcompanan(Acompanante acompanan) {
        this.acompanan = acompanan;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}