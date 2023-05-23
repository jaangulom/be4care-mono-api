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
@Table(name = "diagnostico_especifico")
@Entity
public class DiagnosticoEspecifico {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "cod_4")
    private String cod4;

    @Column(name = "desc_cuatro_carac")
    private String descCuatroCarac;

    @JoinColumn(name = "diagnostico_general_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticoGeneral diagnosticoGeneral;

    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public DiagnosticoGeneral getDiagnosticoGeneral() {
        return diagnosticoGeneral;
    }

    public void setDiagnosticoGeneral(DiagnosticoGeneral diagnosticoGeneral) {
        this.diagnosticoGeneral = diagnosticoGeneral;
    }

    public String getDescCuatroCarac() {
        return descCuatroCarac;
    }

    public void setDescCuatroCarac(String descCuatroCarac) {
        this.descCuatroCarac = descCuatroCarac;
    }

    public String getCod4() {
        return cod4;
    }

    public void setCod4(String cod4) {
        this.cod4 = cod4;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}