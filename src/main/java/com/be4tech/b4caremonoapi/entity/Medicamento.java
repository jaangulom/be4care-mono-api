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
@Table(name = "medicamento")
@Entity
public class Medicamento {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "accion_terapeutica")
    private String accionTerapeutica;

    @Column(name = "aplicacion")
    private String aplicacion;

    @Column(name = "atc")
    private String atc;

    @Column(name = "cantidad_presentacion")
    private String cantidadPresentacion;

    @Column(name = "cod_atc")
    private String codAtc;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;

    @Column(name = "habilitado")
    private Boolean habilitado;

    @Column(name = "imagen")
    private byte[] imagen;

    @Column(name = "imagen_content_type")
    private String imagenContentType;

    @Column(name = "ind_muestra_medica")
    private String indMuestraMedica;

    @Column(name = "is_private_public")
    private String isPrivatePublic;

    @Column(name = "is_standard_gel")
    private String isStandardGel;

    @Column(name = "is_standard_msps")
    private String isStandardMsps;

    @Column(name = "laboratorio")
    private String laboratorio;

    @Column(name = "monograma")
    @Lob
    private String monograma;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "presentacion")
    private String presentacion;

    @Column(name = "principio_activo")
    private String principioActivo;

    @Column(name = "registro_sanitario")
    private String registroSanitario;

    @Column(name = "tabla")
    private String tabla;

    @Column(name = "u_med_prin_activo")
    private String uMedPrinActivo;

    @Column(name = "usuario_responsable")
    private String usuarioResponsable;

    @Column(name = "valor_registro")
    private String valorRegistro;

    @Column(name = "via_administracion")
    private String viaAdministracion;

    public String getViaAdministracion() {
        return viaAdministracion;
    }

    public void setViaAdministracion(String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }

    public String getValorRegistro() {
        return valorRegistro;
    }

    public void setValorRegistro(String valorRegistro) {
        this.valorRegistro = valorRegistro;
    }

    public String getUsuarioResponsable() {
        return usuarioResponsable;
    }

    public void setUsuarioResponsable(String usuarioResponsable) {
        this.usuarioResponsable = usuarioResponsable;
    }

    public String getUMedPrinActivo() {
        return uMedPrinActivo;
    }

    public void setUMedPrinActivo(String uMedPrinActivo) {
        this.uMedPrinActivo = uMedPrinActivo;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getRegistroSanitario() {
        return registroSanitario;
    }

    public void setRegistroSanitario(String registroSanitario) {
        this.registroSanitario = registroSanitario;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMonograma() {
        return monograma;
    }

    public void setMonograma(String monograma) {
        this.monograma = monograma;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getIsStandardMsps() {
        return isStandardMsps;
    }

    public void setIsStandardMsps(String isStandardMsps) {
        this.isStandardMsps = isStandardMsps;
    }

    public String getIsStandardGel() {
        return isStandardGel;
    }

    public void setIsStandardGel(String isStandardGel) {
        this.isStandardGel = isStandardGel;
    }

    public String getIsPrivatePublic() {
        return isPrivatePublic;
    }

    public void setIsPrivatePublic(String isPrivatePublic) {
        this.isPrivatePublic = isPrivatePublic;
    }

    public String getIndMuestraMedica() {
        return indMuestraMedica;
    }

    public void setIndMuestraMedica(String indMuestraMedica) {
        this.indMuestraMedica = indMuestraMedica;
    }

    public String getImagenContentType() {
        return imagenContentType;
    }

    public void setImagenContentType(String imagenContentType) {
        this.imagenContentType = imagenContentType;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodAtc() {
        return codAtc;
    }

    public void setCodAtc(String codAtc) {
        this.codAtc = codAtc;
    }

    public String getCantidadPresentacion() {
        return cantidadPresentacion;
    }

    public void setCantidadPresentacion(String cantidadPresentacion) {
        this.cantidadPresentacion = cantidadPresentacion;
    }

    public String getAtc() {
        return atc;
    }

    public void setAtc(String atc) {
        this.atc = atc;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getAccionTerapeutica() {
        return accionTerapeutica;
    }

    public void setAccionTerapeutica(String accionTerapeutica) {
        this.accionTerapeutica = accionTerapeutica;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}