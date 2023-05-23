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
@Table(name = "vacuna")
@Entity
public class Vacuna {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "empresa_id")
    private String empresa;

    @JoinColumn(name = "enfermedad_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Enfermedad enfermedad;

    @Column(name = "fuente_financiacion")
    private String fuenteFinanciacion;

    @Column(name = "info_extra")
    private String infoExtra;

    @Column(name = "nombre")
    private String nombre;

    @JoinColumn(name = "tipo_vacuna_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoVacuna tipoVacuna;

    public TipoVacuna getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(TipoVacuna tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfoExtra() {
        return infoExtra;
    }

    public void setInfoExtra(String infoExtra) {
        this.infoExtra = infoExtra;
    }

    public String getFuenteFinanciacion() {
        return fuenteFinanciacion;
    }

    public void setFuenteFinanciacion(String fuenteFinanciacion) {
        this.fuenteFinanciacion = fuenteFinanciacion;
    }

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
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