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
@Table(name = "estandar_seguimiento")
@Entity
public class EstandarSeguimiento {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "id_estandar_solicitud")
    private String idEstandarSolicitud;

    @JoinColumn(name = "nombre_escala_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Escala nombreEscala;

    public Escala getNombreEscala() {
        return nombreEscala;
    }

    public void setNombreEscala(Escala nombreEscala) {
        this.nombreEscala = nombreEscala;
    }

    public String getIdEstandarSolicitud() {
        return idEstandarSolicitud;
    }

    public void setIdEstandarSolicitud(String idEstandarSolicitud) {
        this.idEstandarSolicitud = idEstandarSolicitud;
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