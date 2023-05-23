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
@Table(name = "estandar_alarma")
@Entity
public class EstandarAlarma {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "condicion_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Condicion condicion;

    @Column(name = "descripcion")
    @Lob
    private String descripcion;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "prioridad")
    private String prioridad;

    @Column(name = "procedimiento")
    @Lob
    private String procedimiento;

    @JoinColumn(name = "tipo_variable_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoVariable tipoVariable;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "valor_final")
    private Double valorFinal;

    @Column(name = "valor_inicial")
    private Double valorInicial;

    public Double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(Double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public TipoVariable getTipoVariable() {
        return tipoVariable;
    }

    public void setTipoVariable(TipoVariable tipoVariable) {
        this.tipoVariable = tipoVariable;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
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

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}