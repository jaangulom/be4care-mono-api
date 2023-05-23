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
@Table(name = "coordenadas")
@Entity
public class Coordenada {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "altitud")
    private String altitud;

    @Column(name = "altitud_exactitud")
    private String altitudExactitud;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "exactitud")
    private String exactitud;

    @Column(name = "latitud")
    private String latitud;

    @Column(name = "longitud")
    private String longitud;

    @Column(name = "\"timestamp\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private JhiUser user;

    @Column(name = "velocidad")
    private String velocidad;

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public JhiUser getUser() {
        return user;
    }

    public void setUser(JhiUser user) {
        this.user = user;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getExactitud() {
        return exactitud;
    }

    public void setExactitud(String exactitud) {
        this.exactitud = exactitud;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getAltitudExactitud() {
        return altitudExactitud;
    }

    public void setAltitudExactitud(String altitudExactitud) {
        this.altitudExactitud = altitudExactitud;
    }

    public String getAltitud() {
        return altitud;
    }

    public void setAltitud(String altitud) {
        this.altitud = altitud;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}