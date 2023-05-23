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
@Table(name = "solicitudes")
@Entity
public class Solicitude {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "estado")
    private Boolean estado;

    @Column(name = "estado_correo")
    private Boolean estadoCorreo;

    @Column(name = "fecha_correo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCorreo;

    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;

    @JoinColumn(name = "grupo_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private EstandarSolicitude grupo;

    @Column(name = "observacion")
    @Lob
    private String observacion;

    @Column(name = "time_instant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeInstant;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private JhiUser user;

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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public EstandarSolicitude getGrupo() {
        return grupo;
    }

    public void setGrupo(EstandarSolicitude grupo) {
        this.grupo = grupo;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaCorreo() {
        return fechaCorreo;
    }

    public void setFechaCorreo(Date fechaCorreo) {
        this.fechaCorreo = fechaCorreo;
    }

    public Boolean getEstadoCorreo() {
        return estadoCorreo;
    }

    public void setEstadoCorreo(Boolean estadoCorreo) {
        this.estadoCorreo = estadoCorreo;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}