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
@Table(name = "empresa")
@Entity
public class Empresa {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "color_primario")
    private String colorPrimario;

    @Column(name = "color_secundario")
    private String colorSecundario;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "estandar")
    @Lob
    private String estandar;

    @Column(name = "icono")
    private byte[] icono;

    @Column(name = "icono_content_type")
    private String iconoContentType;

    @Column(name = "nit")
    private String nit;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "politica_empresa")
    @Lob
    private String politicaEmpresa;

    @Column(name = "reino")
    private String reino;

    @Column(name = "telefono")
    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getPoliticaEmpresa() {
        return politicaEmpresa;
    }

    public void setPoliticaEmpresa(String politicaEmpresa) {
        this.politicaEmpresa = politicaEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getIconoContentType() {
        return iconoContentType;
    }

    public void setIconoContentType(String iconoContentType) {
        this.iconoContentType = iconoContentType;
    }

    public byte[] getIcono() {
        return icono;
    }

    public void setIcono(byte[] icono) {
        this.icono = icono;
    }

    public String getEstandar() {
        return estandar;
    }

    public void setEstandar(String estandar) {
        this.estandar = estandar;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}