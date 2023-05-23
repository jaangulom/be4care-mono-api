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
@Table(name = "triage")
@Entity
public class Triage {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "boton_ayuda")
    private Boolean botonAyuda;

    @Column(name = "descripcion")
    @Lob
    private String descripcion;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    @Column(name = "news_2")
    private Integer news2;

    @Column(name = "novedades")
    private Boolean novedades;

    @Column(name = "observaciones")
    private String observaciones;

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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Boolean getNovedades() {
        return novedades;
    }

    public void setNovedades(Boolean novedades) {
        this.novedades = novedades;
    }

    public Integer getNews2() {
        return news2;
    }

    public void setNews2(Integer news2) {
        this.news2 = news2;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getBotonAyuda() {
        return botonAyuda;
    }

    public void setBotonAyuda(Boolean botonAyuda) {
        this.botonAyuda = botonAyuda;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}