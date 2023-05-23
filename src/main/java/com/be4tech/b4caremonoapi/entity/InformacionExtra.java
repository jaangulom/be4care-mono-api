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
@Table(name = "informacion_extra")
@Entity
public class InformacionExtra {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "comple_tera_paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CompleTeraPaciente compleTeraPaciente;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "documentos")
    private byte[] documentos;

    @Column(name = "documentos_content_type")
    private String documentosContentType;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Column(name = "tipo_procedimiento")
    private String tipoProcedimiento;

    public String getTipoProcedimiento() {
        return tipoProcedimiento;
    }

    public void setTipoProcedimiento(String tipoProcedimiento) {
        this.tipoProcedimiento = tipoProcedimiento;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDocumentosContentType() {
        return documentosContentType;
    }

    public void setDocumentosContentType(String documentosContentType) {
        this.documentosContentType = documentosContentType;
    }

    public byte[] getDocumentos() {
        return documentos;
    }

    public void setDocumentos(byte[] documentos) {
        this.documentos = documentos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CompleTeraPaciente getCompleTeraPaciente() {
        return compleTeraPaciente;
    }

    public void setCompleTeraPaciente(CompleTeraPaciente compleTeraPaciente) {
        this.compleTeraPaciente = compleTeraPaciente;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}