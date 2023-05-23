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
@Table(name = "datos_extra_paciente")
@Entity
public class DatosExtraPaciente {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "coment_desp_disp")
    private String comentDespDisp;

    @Column(name = "comorbilidades")
    private String comorbilidades;

    @Column(name = "crisis_antes_disp")
    private Integer crisisAntesDisp;

    @Column(name = "crisis_desp_disp")
    private Integer crisisDespDisp;

    @Column(name = "descripcion")
    @Lob
    private String descripcion;

    @Column(name = "descripcion_1")
    private String descripcion1;

    @Column(name = "descripcion_2")
    private String descripcion2;

    @Column(name = "descripcion_3")
    private String descripcion3;

    @Column(name = "descripcion_4")
    private String descripcion4;

    @Column(name = "descripcion_5")
    private String descripcion5;

    @Column(name = "descripcion_6")
    private String descripcion6;

    @Column(name = "descripcion_7")
    private String descripcion7;

    @Column(name = "descripcion_8")
    private String descripcion8;

    @Column(name = "descripcion_9")
    private String descripcion9;

    @Column(name = "diagnostico")
    private String diagnostico;

    @Column(name = "dieta")
    private String dieta;

    @Column(name = "efectos_segund_disp")
    private String efectosSegundDisp;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "escolaridad")
    private String escolaridad;

    @Column(name = "estado_civil")
    private String estadoCivil;

    @Column(name = "estado_laboral")
    private String estadoLaboral;

    @Column(name = "estatus_antes_dips")
    private Integer estatusAntesDips;

    @Column(name = "estatus_desp_disp")
    private Integer estatusDespDisp;

    @Column(name = "fase")
    private String fase;

    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;

    @Column(name = "fecha_crisis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCrisis;

    @Column(name = "fecha_implantacion_disp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaImplantacionDisp;

    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;

    @Column(name = "grupo_poblacional")
    @Lob
    private String grupoPoblacional;

    @Column(name = "identidad_genero")
    @Lob
    private String identidadGenero;

    @Column(name = "ips_paciente")
    @Lob
    private String ipsPaciente;

    @Column(name = "lateralidad")
    private String lateralidad;

    @Column(name = "modelo_disp")
    private String modeloDisp;

    @JoinColumn(name = "paciente_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    @Column(name = "profesion")
    private String profesion;

    @Column(name = "raza")
    @Lob
    private String raza;

    @Column(name = "religion")
    private String religion;

    @Column(name = "revision_sistemas")
    @Lob
    private String revisionSistemas;

    @Column(name = "tipo_familia")
    private String tipoFamilia;

    public String getTipoFamilia() {
        return tipoFamilia;
    }

    public void setTipoFamilia(String tipoFamilia) {
        this.tipoFamilia = tipoFamilia;
    }

    public String getRevisionSistemas() {
        return revisionSistemas;
    }

    public void setRevisionSistemas(String revisionSistemas) {
        this.revisionSistemas = revisionSistemas;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getModeloDisp() {
        return modeloDisp;
    }

    public void setModeloDisp(String modeloDisp) {
        this.modeloDisp = modeloDisp;
    }

    public String getLateralidad() {
        return lateralidad;
    }

    public void setLateralidad(String lateralidad) {
        this.lateralidad = lateralidad;
    }

    public String getIpsPaciente() {
        return ipsPaciente;
    }

    public void setIpsPaciente(String ipsPaciente) {
        this.ipsPaciente = ipsPaciente;
    }

    public String getIdentidadGenero() {
        return identidadGenero;
    }

    public void setIdentidadGenero(String identidadGenero) {
        this.identidadGenero = identidadGenero;
    }

    public String getGrupoPoblacional() {
        return grupoPoblacional;
    }

    public void setGrupoPoblacional(String grupoPoblacional) {
        this.grupoPoblacional = grupoPoblacional;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaImplantacionDisp() {
        return fechaImplantacionDisp;
    }

    public void setFechaImplantacionDisp(Date fechaImplantacionDisp) {
        this.fechaImplantacionDisp = fechaImplantacionDisp;
    }

    public Date getFechaCrisis() {
        return fechaCrisis;
    }

    public void setFechaCrisis(Date fechaCrisis) {
        this.fechaCrisis = fechaCrisis;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public Integer getEstatusDespDisp() {
        return estatusDespDisp;
    }

    public void setEstatusDespDisp(Integer estatusDespDisp) {
        this.estatusDespDisp = estatusDespDisp;
    }

    public Integer getEstatusAntesDips() {
        return estatusAntesDips;
    }

    public void setEstatusAntesDips(Integer estatusAntesDips) {
        this.estatusAntesDips = estatusAntesDips;
    }

    public String getEstadoLaboral() {
        return estadoLaboral;
    }

    public void setEstadoLaboral(String estadoLaboral) {
        this.estadoLaboral = estadoLaboral;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEfectosSegundDisp() {
        return efectosSegundDisp;
    }

    public void setEfectosSegundDisp(String efectosSegundDisp) {
        this.efectosSegundDisp = efectosSegundDisp;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDescripcion9() {
        return descripcion9;
    }

    public void setDescripcion9(String descripcion9) {
        this.descripcion9 = descripcion9;
    }

    public String getDescripcion8() {
        return descripcion8;
    }

    public void setDescripcion8(String descripcion8) {
        this.descripcion8 = descripcion8;
    }

    public String getDescripcion7() {
        return descripcion7;
    }

    public void setDescripcion7(String descripcion7) {
        this.descripcion7 = descripcion7;
    }

    public String getDescripcion6() {
        return descripcion6;
    }

    public void setDescripcion6(String descripcion6) {
        this.descripcion6 = descripcion6;
    }

    public String getDescripcion5() {
        return descripcion5;
    }

    public void setDescripcion5(String descripcion5) {
        this.descripcion5 = descripcion5;
    }

    public String getDescripcion4() {
        return descripcion4;
    }

    public void setDescripcion4(String descripcion4) {
        this.descripcion4 = descripcion4;
    }

    public String getDescripcion3() {
        return descripcion3;
    }

    public void setDescripcion3(String descripcion3) {
        this.descripcion3 = descripcion3;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCrisisDespDisp() {
        return crisisDespDisp;
    }

    public void setCrisisDespDisp(Integer crisisDespDisp) {
        this.crisisDespDisp = crisisDespDisp;
    }

    public Integer getCrisisAntesDisp() {
        return crisisAntesDisp;
    }

    public void setCrisisAntesDisp(Integer crisisAntesDisp) {
        this.crisisAntesDisp = crisisAntesDisp;
    }

    public String getComorbilidades() {
        return comorbilidades;
    }

    public void setComorbilidades(String comorbilidades) {
        this.comorbilidades = comorbilidades;
    }

    public String getComentDespDisp() {
        return comentDespDisp;
    }

    public void setComentDespDisp(String comentDespDisp) {
        this.comentDespDisp = comentDespDisp;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}