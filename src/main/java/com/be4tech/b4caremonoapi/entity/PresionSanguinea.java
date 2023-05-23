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
@Table(name = "presion_sanguinea")
@Entity
public class PresionSanguinea {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    @Column(name = "presion_sanguinea_diastolica")
    private Integer presionSanguineaDiastolica;

    @Column(name = "presion_sanguinea_sistolica")
    private Integer presionSanguineaSistolica;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private JhiUser user;

    public JhiUser getUser() {
        return user;
    }

    public void setUser(JhiUser user) {
        this.user = user;
    }

    public Integer getPresionSanguineaSistolica() {
        return presionSanguineaSistolica;
    }

    public void setPresionSanguineaSistolica(Integer presionSanguineaSistolica) {
        this.presionSanguineaSistolica = presionSanguineaSistolica;
    }

    public Integer getPresionSanguineaDiastolica() {
        return presionSanguineaDiastolica;
    }

    public void setPresionSanguineaDiastolica(Integer presionSanguineaDiastolica) {
        this.presionSanguineaDiastolica = presionSanguineaDiastolica;
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