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
@Table(name = "segimiento_disp")
@Entity
public class SegimientoDisp {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "ancho_pulso_au")
    @Lob
    private String anchoPulsoAu;

    @Column(name = "ancho_pulso_iman")
    private String anchoPulsoIman;

    @Column(name = "ancho_pulso_nor")
    private String anchoPulsoNor;

    @Column(name = "bateria_generador")
    @Lob
    private String bateriaGenerador;

    @Column(name = "ciclo_trabajo")
    @Lob
    private String cicloTrabajo;

    @Column(name = "corriente_salida_au")
    @Lob
    private String corrienteSalidaAu;

    @Column(name = "corriente_salida_iman")
    private String corrienteSalidaIman;

    @Column(name = "corriente_salida_nor")
    private String corrienteSalidaNor;

    @JoinColumn(name = "dispositivo_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private DispositivoMed dispositivo;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Column(name = "fecha_implantacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaImplantacion;

    @Column(name = "fecha_programacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaProgramacion;

    @Column(name = "id_encargado")
    private String idEncargado;

    @Column(name = "impedancia_kohms")
    private Integer impedanciaKohms;

    @Column(name = "modelo_generador")
    private String modeloGenerador;

    @Column(name = "senal_frecuencia")
    private String senalFrecuencia;

    @Column(name = "senal_frecuencia_au")
    @Lob
    private String senalFrecuenciaAu;

    @Column(name = "serial_generador")
    @Lob
    private String serialGenerador;

    @Column(name = "time_off_autostim")
    @Lob
    private String timeOffAutostim;

    @Column(name = "time_off_norm")
    private String timeOffNorm;

    @Column(name = "time_on_autostim")
    @Lob
    private String timeOnAutostim;

    @Column(name = "time_on_iman")
    private String timeOnIman;

    @Column(name = "time_on_norm")
    private String timeOnNorm;

    public String getTimeOnNorm() {
        return timeOnNorm;
    }

    public void setTimeOnNorm(String timeOnNorm) {
        this.timeOnNorm = timeOnNorm;
    }

    public String getTimeOnIman() {
        return timeOnIman;
    }

    public void setTimeOnIman(String timeOnIman) {
        this.timeOnIman = timeOnIman;
    }

    public String getTimeOnAutostim() {
        return timeOnAutostim;
    }

    public void setTimeOnAutostim(String timeOnAutostim) {
        this.timeOnAutostim = timeOnAutostim;
    }

    public String getTimeOffNorm() {
        return timeOffNorm;
    }

    public void setTimeOffNorm(String timeOffNorm) {
        this.timeOffNorm = timeOffNorm;
    }

    public String getTimeOffAutostim() {
        return timeOffAutostim;
    }

    public void setTimeOffAutostim(String timeOffAutostim) {
        this.timeOffAutostim = timeOffAutostim;
    }

    public String getSerialGenerador() {
        return serialGenerador;
    }

    public void setSerialGenerador(String serialGenerador) {
        this.serialGenerador = serialGenerador;
    }

    public String getSenalFrecuenciaAu() {
        return senalFrecuenciaAu;
    }

    public void setSenalFrecuenciaAu(String senalFrecuenciaAu) {
        this.senalFrecuenciaAu = senalFrecuenciaAu;
    }

    public String getSenalFrecuencia() {
        return senalFrecuencia;
    }

    public void setSenalFrecuencia(String senalFrecuencia) {
        this.senalFrecuencia = senalFrecuencia;
    }

    public String getModeloGenerador() {
        return modeloGenerador;
    }

    public void setModeloGenerador(String modeloGenerador) {
        this.modeloGenerador = modeloGenerador;
    }

    public Integer getImpedanciaKohms() {
        return impedanciaKohms;
    }

    public void setImpedanciaKohms(Integer impedanciaKohms) {
        this.impedanciaKohms = impedanciaKohms;
    }

    public String getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(String idEncargado) {
        this.idEncargado = idEncargado;
    }

    public Date getFechaProgramacion() {
        return fechaProgramacion;
    }

    public void setFechaProgramacion(Date fechaProgramacion) {
        this.fechaProgramacion = fechaProgramacion;
    }

    public Date getFechaImplantacion() {
        return fechaImplantacion;
    }

    public void setFechaImplantacion(Date fechaImplantacion) {
        this.fechaImplantacion = fechaImplantacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public DispositivoMed getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(DispositivoMed dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getCorrienteSalidaNor() {
        return corrienteSalidaNor;
    }

    public void setCorrienteSalidaNor(String corrienteSalidaNor) {
        this.corrienteSalidaNor = corrienteSalidaNor;
    }

    public String getCorrienteSalidaIman() {
        return corrienteSalidaIman;
    }

    public void setCorrienteSalidaIman(String corrienteSalidaIman) {
        this.corrienteSalidaIman = corrienteSalidaIman;
    }

    public String getCorrienteSalidaAu() {
        return corrienteSalidaAu;
    }

    public void setCorrienteSalidaAu(String corrienteSalidaAu) {
        this.corrienteSalidaAu = corrienteSalidaAu;
    }

    public String getCicloTrabajo() {
        return cicloTrabajo;
    }

    public void setCicloTrabajo(String cicloTrabajo) {
        this.cicloTrabajo = cicloTrabajo;
    }

    public String getBateriaGenerador() {
        return bateriaGenerador;
    }

    public void setBateriaGenerador(String bateriaGenerador) {
        this.bateriaGenerador = bateriaGenerador;
    }

    public String getAnchoPulsoNor() {
        return anchoPulsoNor;
    }

    public void setAnchoPulsoNor(String anchoPulsoNor) {
        this.anchoPulsoNor = anchoPulsoNor;
    }

    public String getAnchoPulsoIman() {
        return anchoPulsoIman;
    }

    public void setAnchoPulsoIman(String anchoPulsoIman) {
        this.anchoPulsoIman = anchoPulsoIman;
    }

    public String getAnchoPulsoAu() {
        return anchoPulsoAu;
    }

    public void setAnchoPulsoAu(String anchoPulsoAu) {
        this.anchoPulsoAu = anchoPulsoAu;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}