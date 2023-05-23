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
@Table(name = "adherencia")
@Entity
public class Adherencia {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "hora_programada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaProgramada;

    @Column(name = "hora_real")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaReal;

    @Column(name = "hora_toma")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaToma;

    @JoinColumn(name = "medicamento_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Medicamento medicamento;

    @JoinColumn(name = "paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    @Column(name = "respuesta")
    private Boolean respuesta;

    @Column(name = "valor")
    private Integer valor;

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Boolean getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Boolean respuesta) {
        this.respuesta = respuesta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Date getHoraToma() {
        return horaToma;
    }

    public void setHoraToma(Date horaToma) {
        this.horaToma = horaToma;
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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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