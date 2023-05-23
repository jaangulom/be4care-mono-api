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
@Table(name = "encuesta")
@Entity
public class Encuesta {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "empresa_id")
    private String empresa;

    @JoinColumn(name = "estandar_pregunta_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private EstandarPregunta estandarPregunta;

    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @Column(name = "respuesta")
    @Lob
    private String respuesta;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private JhiUser user;

    public JhiUser getUser() {
        return user;
    }

    public void setUser(JhiUser user) {
        this.user = user;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public EstandarPregunta getEstandarPregunta() {
        return estandarPregunta;
    }

    public void setEstandarPregunta(EstandarPregunta estandarPregunta) {
        this.estandarPregunta = estandarPregunta;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}