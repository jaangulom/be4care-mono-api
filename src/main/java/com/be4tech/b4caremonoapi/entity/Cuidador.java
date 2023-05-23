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
@Table(name = "cuidador")
@Entity
public class Cuidador {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "correo_cuidador")
    private String correoCuidador;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "id_rol")
    private String idRol;

    @Column(name = "nombre_cuidador")
    private String nombreCuidador;

    @Column(name = "telefono_cuidador")
    private String telefonoCuidador;

    @JoinColumn(name = "user_id", unique = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private JhiUser user;

    public JhiUser getUser() {
        return user;
    }

    public void setUser(JhiUser user) {
        this.user = user;
    }

    public String getTelefonoCuidador() {
        return telefonoCuidador;
    }

    public void setTelefonoCuidador(String telefonoCuidador) {
        this.telefonoCuidador = telefonoCuidador;
    }

    public String getNombreCuidador() {
        return nombreCuidador;
    }

    public void setNombreCuidador(String nombreCuidador) {
        this.nombreCuidador = nombreCuidador;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCorreoCuidador() {
        return correoCuidador;
    }

    public void setCorreoCuidador(String correoCuidador) {
        this.correoCuidador = correoCuidador;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}