package com.be4tech.b4caremonoapi.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;
import io.jmix.data.DdlGeneration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Store(name = "b4mono")
@Table(name = "escala")
@Entity
public class Escala {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "nivel_0")
    private String nivel0;

    @Column(name = "nivel_1")
    private String nivel1;

    @Column(name = "nivel_2")
    private String nivel2;

    @Column(name = "nivel_3")
    private String nivel3;

    @Column(name = "nivel_4")
    private String nivel4;

    @Column(name = "nivel_5")
    private String nivel5;

    @Column(name = "nivel_6")
    private String nivel6;

    @Column(name = "nivel_7")
    private String nivel7;

    @Column(name = "nivel_8")
    private String nivel8;

    @Column(name = "nivel_9")
    private String nivel9;

    @Column(name = "nivel_accion")
    private String nivelAccion;

    @Column(name = "nombre_escala")
    private String nombreEscala;

    public String getNombreEscala() {
        return nombreEscala;
    }

    public void setNombreEscala(String nombreEscala) {
        this.nombreEscala = nombreEscala;
    }

    public String getNivelAccion() {
        return nivelAccion;
    }

    public void setNivelAccion(String nivelAccion) {
        this.nivelAccion = nivelAccion;
    }

    public String getNivel9() {
        return nivel9;
    }

    public void setNivel9(String nivel9) {
        this.nivel9 = nivel9;
    }

    public String getNivel8() {
        return nivel8;
    }

    public void setNivel8(String nivel8) {
        this.nivel8 = nivel8;
    }

    public String getNivel7() {
        return nivel7;
    }

    public void setNivel7(String nivel7) {
        this.nivel7 = nivel7;
    }

    public String getNivel6() {
        return nivel6;
    }

    public void setNivel6(String nivel6) {
        this.nivel6 = nivel6;
    }

    public String getNivel5() {
        return nivel5;
    }

    public void setNivel5(String nivel5) {
        this.nivel5 = nivel5;
    }

    public String getNivel4() {
        return nivel4;
    }

    public void setNivel4(String nivel4) {
        this.nivel4 = nivel4;
    }

    public String getNivel3() {
        return nivel3;
    }

    public void setNivel3(String nivel3) {
        this.nivel3 = nivel3;
    }

    public String getNivel2() {
        return nivel2;
    }

    public void setNivel2(String nivel2) {
        this.nivel2 = nivel2;
    }

    public String getNivel1() {
        return nivel1;
    }

    public void setNivel1(String nivel1) {
        this.nivel1 = nivel1;
    }

    public String getNivel0() {
        return nivel0;
    }

    public void setNivel0(String nivel0) {
        this.nivel0 = nivel0;
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