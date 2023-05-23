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
@Table(name = "dosis_vacuna")
@Entity
public class DosisVacuna {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "categoria_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Categoria categoria;

    @Column(name = "dosis")
    private Integer dosis;

    @Column(name = "empresa_id")
    private String empresa;

    @JoinColumn(name = "vacuna_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Vacuna vacuna;

    public Vacuna getVacuna() {
        return vacuna;
    }

    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getDosis() {
        return dosis;
    }

    public void setDosis(Integer dosis) {
        this.dosis = dosis;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}