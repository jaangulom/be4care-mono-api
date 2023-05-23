package com.be4tech.b4caremonoapi.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.util.UUID;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Store(name = "b4mono")
@Table(name = "area")
@Entity
public class Area {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "correo_area")
    private String correoArea;

    @Column(name = "descripcion_area")
    private String descripcionArea;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "estado_area")
    private Boolean estadoArea;

    @JoinColumn(name = "ips_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ip ips;

    @Column(name = "nivel_complejidad")
    private String nivelComplejidad;

    @Column(name = "nombre_area")
    private String nombreArea;

    @Column(name = "telefono_area")
    private String telefonoArea;

    public String getTelefonoArea() {
        return telefonoArea;
    }

    public void setTelefonoArea(String telefonoArea) {
        this.telefonoArea = telefonoArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getNivelComplejidad() {
        return nivelComplejidad;
    }

    public void setNivelComplejidad(String nivelComplejidad) {
        this.nivelComplejidad = nivelComplejidad;
    }

    public Ip getIps() {
        return ips;
    }

    public void setIps(Ip ips) {
        this.ips = ips;
    }

    public Boolean getEstadoArea() {
        return estadoArea;
    }

    public void setEstadoArea(Boolean estadoArea) {
        this.estadoArea = estadoArea;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcionArea() {
        return descripcionArea;
    }

    public void setDescripcionArea(String descripcionArea) {
        this.descripcionArea = descripcionArea;
    }

    public String getCorreoArea() {
        return correoArea;
    }

    public void setCorreoArea(String correoArea) {
        this.correoArea = correoArea;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}