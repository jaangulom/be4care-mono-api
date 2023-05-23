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
@Table(name = "antecedentes")
@Entity
public class Antecedente {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "alergicos")
    private String alergicos;

    @Column(name = "edad_a_familiar")
    @Lob
    private String edadAFamiliar;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "familiares")
    @Lob
    private String familiares;

    @JoinColumn(name = "historia_clinica_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private HistoriaClinica historiaClinica;

    @Column(name = "medicamentos")
    private String medicamentos;

    @Column(name = "neuro_desarrollo")
    private String neuroDesarrollo;

    @Column(name = "nombre")
    @Lob
    private String nombre;

    @Column(name = "observacion")
    @Lob
    private String observacion;

    @JoinColumn(name = "paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    @Column(name = "parentesco")
    @Lob
    private String parentesco;

    @Column(name = "patologicos")
    private String patologicos;

    @Column(name = "quirurgicos")
    private String quirurgicos;

    @Column(name = "tipo_antecedente")
    @Lob
    private String tipoAntecedente;

    @Column(name = "toxicos")
    private String toxicos;

    @JoinColumn(name = "user_id", unique = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private JhiUser user;

    public JhiUser getUser() {
        return user;
    }

    public void setUser(JhiUser user) {
        this.user = user;
    }

    public String getToxicos() {
        return toxicos;
    }

    public void setToxicos(String toxicos) {
        this.toxicos = toxicos;
    }

    public String getTipoAntecedente() {
        return tipoAntecedente;
    }

    public void setTipoAntecedente(String tipoAntecedente) {
        this.tipoAntecedente = tipoAntecedente;
    }

    public String getQuirurgicos() {
        return quirurgicos;
    }

    public void setQuirurgicos(String quirurgicos) {
        this.quirurgicos = quirurgicos;
    }

    public String getPatologicos() {
        return patologicos;
    }

    public void setPatologicos(String patologicos) {
        this.patologicos = patologicos;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNeuroDesarrollo() {
        return neuroDesarrollo;
    }

    public void setNeuroDesarrollo(String neuroDesarrollo) {
        this.neuroDesarrollo = neuroDesarrollo;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public String getFamiliares() {
        return familiares;
    }

    public void setFamiliares(String familiares) {
        this.familiares = familiares;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEdadAFamiliar() {
        return edadAFamiliar;
    }

    public void setEdadAFamiliar(String edadAFamiliar) {
        this.edadAFamiliar = edadAFamiliar;
    }

    public String getAlergicos() {
        return alergicos;
    }

    public void setAlergicos(String alergicos) {
        this.alergicos = alergicos;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}