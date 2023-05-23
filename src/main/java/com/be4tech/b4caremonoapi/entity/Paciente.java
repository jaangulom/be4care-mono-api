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
@Table(name = "paciente")
@Entity
public class Paciente {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "calorias_referencia")
    private Integer caloriasReferencia;

    @Column(name = "comentarios")
    @Lob
    private String comentarios;

    @JoinColumn(name = "condicion_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Condicion condicion;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "edad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date edad;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "estatura_cm")
    private Integer estaturaCm;

    @JoinColumn(name = "grupo_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Grupo grupo;

    @Column(name = "id_rol")
    private String idRol;

    @Column(name = "identificacion")
    private Integer identificacion;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "pasos_referencia")
    private Integer pasosReferencia;

    @Column(name = "peso_kg")
    private Double pesoKg;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;

    @JoinColumn(name = "tratamiento_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Tratamiento tratamiento;

    @JoinColumn(name = "user_id", unique = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private JhiUser user;

    public JhiUser getUser() {
        return user;
    }

    public void setUser(JhiUser user) {
        this.user = user;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Integer getPasosReferencia() {
        return pasosReferencia;
    }

    public void setPasosReferencia(Integer pasosReferencia) {
        this.pasosReferencia = pasosReferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Integer getEstaturaCm() {
        return estaturaCm;
    }

    public void setEstaturaCm(Integer estaturaCm) {
        this.estaturaCm = estaturaCm;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getEdad() {
        return edad;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Integer getCaloriasReferencia() {
        return caloriasReferencia;
    }

    public void setCaloriasReferencia(Integer caloriasReferencia) {
        this.caloriasReferencia = caloriasReferencia;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}