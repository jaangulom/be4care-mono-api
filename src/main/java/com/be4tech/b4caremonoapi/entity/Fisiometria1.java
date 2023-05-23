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
@Table(name = "fisiometria_1")
@Entity
public class Fisiometria1 {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    @Column(name = "fecha_toma")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaToma;

    @Column(name = "oximetria")
    private Integer oximetria;

    @Column(name = "presion_arterial_diastolica")
    private Integer presionArterialDiastolica;

    @Column(name = "presion_arterial_sistolica")
    private Integer presionArterialSistolica;

    @Column(name = "ritmo_cardiaco")
    private Integer ritmoCardiaco;

    @Column(name = "ritmo_respiratorio")
    private Integer ritmoRespiratorio;

    @Column(name = "temperatura")
    private Double temperatura;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private JhiUser user;

    public JhiUser getUser() {
        return user;
    }

    public void setUser(JhiUser user) {
        this.user = user;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getRitmoRespiratorio() {
        return ritmoRespiratorio;
    }

    public void setRitmoRespiratorio(Integer ritmoRespiratorio) {
        this.ritmoRespiratorio = ritmoRespiratorio;
    }

    public Integer getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(Integer ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public Integer getPresionArterialSistolica() {
        return presionArterialSistolica;
    }

    public void setPresionArterialSistolica(Integer presionArterialSistolica) {
        this.presionArterialSistolica = presionArterialSistolica;
    }

    public Integer getPresionArterialDiastolica() {
        return presionArterialDiastolica;
    }

    public void setPresionArterialDiastolica(Integer presionArterialDiastolica) {
        this.presionArterialDiastolica = presionArterialDiastolica;
    }

    public Integer getOximetria() {
        return oximetria;
    }

    public void setOximetria(Integer oximetria) {
        this.oximetria = oximetria;
    }

    public Date getFechaToma() {
        return fechaToma;
    }

    public void setFechaToma(Date fechaToma) {
        this.fechaToma = fechaToma;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}