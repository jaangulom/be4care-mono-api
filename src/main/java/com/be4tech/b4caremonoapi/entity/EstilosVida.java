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
@Table(name = "estilos_vida")
@Entity
public class EstilosVida {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "actividad_fisica")
    private Boolean actividadFisica;

    @Column(name = "cien_cigarrillos")
    private Boolean cienCigarrillos;

    @Column(name = "cigarrillos_seis_meses")
    private Boolean cigarrillosSeisMeses;

    @Column(name = "clasifica_fumador_activo")
    private String clasificaFumadorActivo;

    @Column(name = "clasificacion_alcohol")
    private String clasificacionAlcohol;

    @Column(name = "consumo_alcohol")
    private String consumoAlcohol;

    @Column(name = "empresa_id")
    @Lob
    private String empresa;

    @Column(name = "fumador_pasivo")
    private Boolean fumadorPasivo;

    @JoinColumn(name = "historia_clinica_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private HistoriaClinica historiaClinica;

    @Column(name = "observa_fumador_pasivo")
    private String observaFumadorPasivo;

    @Column(name = "observacion_alcohol")
    private String observacionAlcohol;

    @Column(name = "observacion_fisica")
    private String observacionFisica;

    @Column(name = "observacion_fumador_activo")
    private String observacionFumadorActivo;

    @Column(name = "observacion_psicoactivas")
    private String observacionPsicoactivas;

    @Column(name = "otros_habitos")
    private String otrosHabitos;

    @JoinColumn(name = "paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    @Column(name = "sustancias_psicoactivas")
    private Boolean sustanciasPsicoactivas;

    @Column(name = "time_instant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeInstant;

    @Column(name = "update_intant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateIntant;

    public Date getUpdateIntant() {
        return updateIntant;
    }

    public void setUpdateIntant(Date updateIntant) {
        this.updateIntant = updateIntant;
    }

    public Date getTimeInstant() {
        return timeInstant;
    }

    public void setTimeInstant(Date timeInstant) {
        this.timeInstant = timeInstant;
    }

    public Boolean getSustanciasPsicoactivas() {
        return sustanciasPsicoactivas;
    }

    public void setSustanciasPsicoactivas(Boolean sustanciasPsicoactivas) {
        this.sustanciasPsicoactivas = sustanciasPsicoactivas;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getOtrosHabitos() {
        return otrosHabitos;
    }

    public void setOtrosHabitos(String otrosHabitos) {
        this.otrosHabitos = otrosHabitos;
    }

    public String getObservacionPsicoactivas() {
        return observacionPsicoactivas;
    }

    public void setObservacionPsicoactivas(String observacionPsicoactivas) {
        this.observacionPsicoactivas = observacionPsicoactivas;
    }

    public String getObservacionFumadorActivo() {
        return observacionFumadorActivo;
    }

    public void setObservacionFumadorActivo(String observacionFumadorActivo) {
        this.observacionFumadorActivo = observacionFumadorActivo;
    }

    public String getObservacionFisica() {
        return observacionFisica;
    }

    public void setObservacionFisica(String observacionFisica) {
        this.observacionFisica = observacionFisica;
    }

    public String getObservacionAlcohol() {
        return observacionAlcohol;
    }

    public void setObservacionAlcohol(String observacionAlcohol) {
        this.observacionAlcohol = observacionAlcohol;
    }

    public String getObservaFumadorPasivo() {
        return observaFumadorPasivo;
    }

    public void setObservaFumadorPasivo(String observaFumadorPasivo) {
        this.observaFumadorPasivo = observaFumadorPasivo;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public Boolean getFumadorPasivo() {
        return fumadorPasivo;
    }

    public void setFumadorPasivo(Boolean fumadorPasivo) {
        this.fumadorPasivo = fumadorPasivo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getConsumoAlcohol() {
        return consumoAlcohol;
    }

    public void setConsumoAlcohol(String consumoAlcohol) {
        this.consumoAlcohol = consumoAlcohol;
    }

    public String getClasificacionAlcohol() {
        return clasificacionAlcohol;
    }

    public void setClasificacionAlcohol(String clasificacionAlcohol) {
        this.clasificacionAlcohol = clasificacionAlcohol;
    }

    public String getClasificaFumadorActivo() {
        return clasificaFumadorActivo;
    }

    public void setClasificaFumadorActivo(String clasificaFumadorActivo) {
        this.clasificaFumadorActivo = clasificaFumadorActivo;
    }

    public Boolean getCigarrillosSeisMeses() {
        return cigarrillosSeisMeses;
    }

    public void setCigarrillosSeisMeses(Boolean cigarrillosSeisMeses) {
        this.cigarrillosSeisMeses = cigarrillosSeisMeses;
    }

    public Boolean getCienCigarrillos() {
        return cienCigarrillos;
    }

    public void setCienCigarrillos(Boolean cienCigarrillos) {
        this.cienCigarrillos = cienCigarrillos;
    }

    public Boolean getActividadFisica() {
        return actividadFisica;
    }

    public void setActividadFisica(Boolean actividadFisica) {
        this.actividadFisica = actividadFisica;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}