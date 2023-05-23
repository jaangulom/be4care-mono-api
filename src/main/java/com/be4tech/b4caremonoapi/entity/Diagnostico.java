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
@Table(name = "diagnostico")
@Entity
public class Diagnostico {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "descripcion_1")
    private String descripcion1;

    @Column(name = "descripcion_2")
    private String descripcion2;

    @Column(name = "descripcion_3")
    private String descripcion3;

    @Column(name = "descripcion_4")
    @Temporal(TemporalType.TIMESTAMP)
    private Date descripcion4;

    @Column(name = "descripcion_5")
    private String descripcion5;

    @Column(name = "descripcion_6")
    private String descripcion6;

    @Column(name = "descripcion_7")
    private String descripcion7;

    @Column(name = "descripcion_8")
    private String descripcion8;

    @Column(name = "descripcion_9")
    private String descripcion9;

    @Column(name = "diagnostico")
    private String diagnostico;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "encargado_id")
    private String encargado;

    @Column(name = "escala")
    private String escala;

    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;

    @JoinColumn(name = "paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    @Column(name = "time_instant")
    private String timeInstant;

    public String getTimeInstant() {
        return timeInstant;
    }

    public void setTimeInstant(String timeInstant) {
        this.timeInstant = timeInstant;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDescripcion9() {
        return descripcion9;
    }

    public void setDescripcion9(String descripcion9) {
        this.descripcion9 = descripcion9;
    }

    public String getDescripcion8() {
        return descripcion8;
    }

    public void setDescripcion8(String descripcion8) {
        this.descripcion8 = descripcion8;
    }

    public String getDescripcion7() {
        return descripcion7;
    }

    public void setDescripcion7(String descripcion7) {
        this.descripcion7 = descripcion7;
    }

    public String getDescripcion6() {
        return descripcion6;
    }

    public void setDescripcion6(String descripcion6) {
        this.descripcion6 = descripcion6;
    }

    public String getDescripcion5() {
        return descripcion5;
    }

    public void setDescripcion5(String descripcion5) {
        this.descripcion5 = descripcion5;
    }

    public Date getDescripcion4() {
        return descripcion4;
    }

    public void setDescripcion4(Date descripcion4) {
        this.descripcion4 = descripcion4;
    }

    public String getDescripcion3() {
        return descripcion3;
    }

    public void setDescripcion3(String descripcion3) {
        this.descripcion3 = descripcion3;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}