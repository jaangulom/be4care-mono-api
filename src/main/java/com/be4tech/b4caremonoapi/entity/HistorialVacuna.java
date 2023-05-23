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
@Table(name = "historial_vacuna")
@Entity
public class HistorialVacuna {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "dosis_etapa")
    private Integer dosisEtapa;

    @JoinColumn(name = "dosis_vacuna_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private DosisVacuna dosisVacuna;

    @Column(name = "edad")
    private String edad;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "estado")
    private Boolean estado;

    @Column(name = "fecha_programada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaProgramada;

    @Column(name = "fecha_real")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaReal;

    @Column(name = "lote")
    private String lote;

    @JoinColumn(name = "paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    @Column(name = "tipo_inyeccion")
    private String tipoInyeccion;

    @Column(name = "ubicacion")
    private String ubicacion;

    @Column(name = "vacunador")
    private String vacunador;

    public String getVacunador() {
        return vacunador;
    }

    public void setVacunador(String vacunador) {
        this.vacunador = vacunador;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoInyeccion() {
        return tipoInyeccion;
    }

    public void setTipoInyeccion(String tipoInyeccion) {
        this.tipoInyeccion = tipoInyeccion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Date getFechaReal() {
        return fechaReal;
    }

    public void setFechaReal(Date fechaReal) {
        this.fechaReal = fechaReal;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public DosisVacuna getDosisVacuna() {
        return dosisVacuna;
    }

    public void setDosisVacuna(DosisVacuna dosisVacuna) {
        this.dosisVacuna = dosisVacuna;
    }

    public Integer getDosisEtapa() {
        return dosisEtapa;
    }

    public void setDosisEtapa(Integer dosisEtapa) {
        this.dosisEtapa = dosisEtapa;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}