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
@Table(name = "alarma")
@Entity
public class Alarma {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "empresa_id")
    private String empresa;

    @JoinColumn(name = "estandar_alarma_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private EstandarAlarma estandarAlarma;

    @Column(name = "observaciones")
    @Lob
    private String observaciones;

    @Column(name = "time_instant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeInstant;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private JhiUser user;

    @Column(name = "verificar")
    private Boolean verificar;

    public Boolean getVerificar() {
        return verificar;
    }

    public void setVerificar(Boolean verificar) {
        this.verificar = verificar;
    }

    public JhiUser getUser() {
        return user;
    }

    public void setUser(JhiUser user) {
        this.user = user;
    }

    public Date getTimeInstant() {
        return timeInstant;
    }

    public void setTimeInstant(Date timeInstant) {
        this.timeInstant = timeInstant;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public EstandarAlarma getEstandarAlarma() {
        return estandarAlarma;
    }

    public void setEstandarAlarma(EstandarAlarma estandarAlarma) {
        this.estandarAlarma = estandarAlarma;
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