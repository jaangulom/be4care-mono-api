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
@Table(name = "examen_fisico")
@Entity
public class ExamenFisico {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "cabeza_cuello")
    @Lob
    private String cabezaCuello;

    @Column(name = "empresa_id")
    private String empresa;

    @Column(name = "g_clasificacion_glucome")
    private String gClasificacionGlucome;

    @Column(name = "g_pospandrial")
    private Boolean gPospandrial;

    @Column(name = "g_preprandial")
    private Boolean gPreprandial;

    @Column(name = "genitourinario")
    @Lob
    private String genitourinario;

    @Column(name = "gglucometria")
    private Integer gglucometria;

    @Column(name = "m_a_clasificacion")
    private String mAClasificacion;

    @Column(name = "m_a_perime_abdominal")
    private Integer mAPerimeAbdominal;

    @Column(name = "m_a_peso")
    private Integer mAPeso;

    @Column(name = "m_aindi_masa_copo")
    private Integer mAindiMasaCopo;

    @Column(name = "m_atalla")
    private Integer mAtalla;

    @Column(name = "neurologicos")
    @Lob
    private String neurologicos;

    @Column(name = "o_clasificacion_con_o")
    private String oClasificacionConO;

    @Column(name = "o_clasificacion_sin_o")
    private String oClasificacionSinO;

    @Column(name = "o_satura_con_o")
    private Integer oSaturaConO;

    @Column(name = "o_satura_sin_o")
    private Integer oSaturaSinO;

    @Column(name = "osteomuscular")
    @Lob
    private String osteomuscular;

    @Column(name = "p_a_clasificacion_pa")
    private String pAClasificacionPa;

    @Column(name = "p_a_diastolica")
    private Integer pADiastolica;

    @Column(name = "p_a_media")
    private Integer pAMedia;

    @Column(name = "p_a_posicion_toma")
    private String pAPosicionToma;

    @Column(name = "p_a_sistolica")
    private Integer pASistolica;

    @Column(name = "p_a_sitio_toma")
    private String pASitioToma;

    @Column(name = "piel_anexos")
    @Lob
    private String pielAnexos;

    @Column(name = "s_v_clasifi_fre_car")
    private String sVClasifiFreCar;

    @Column(name = "s_v_clasifi_fre_res")
    private String sVClasifiFreRes;

    @Column(name = "s_v_frecuencia_cardia")
    private Integer sVFrecuenciaCardia;

    @Column(name = "s_v_frecuencia_respi")
    private Integer sVFrecuenciaRespi;

    @Column(name = "t_clasificacion_temp")
    private String tClasificacionTemp;

    @Column(name = "t_sitio_temp")
    private String tSitioTemp;

    @Column(name = "t_temperatura")
    private Integer tTemperatura;

    @Column(name = "time_instant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeInstant;

    @Column(name = "torax")
    @Lob
    private String torax;

    @Column(name = "update_intant")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateIntant;

    @Column(name = "vascular_periferico")
    @Lob
    private String vascularPeriferico;

    public String getVascularPeriferico() {
        return vascularPeriferico;
    }

    public void setVascularPeriferico(String vascularPeriferico) {
        this.vascularPeriferico = vascularPeriferico;
    }

    public Date getUpdateIntant() {
        return updateIntant;
    }

    public void setUpdateIntant(Date updateIntant) {
        this.updateIntant = updateIntant;
    }

    public String getTorax() {
        return torax;
    }

    public void setTorax(String torax) {
        this.torax = torax;
    }

    public Date getTimeInstant() {
        return timeInstant;
    }

    public void setTimeInstant(Date timeInstant) {
        this.timeInstant = timeInstant;
    }

    public Integer getTTemperatura() {
        return tTemperatura;
    }

    public void setTTemperatura(Integer tTemperatura) {
        this.tTemperatura = tTemperatura;
    }

    public String getTSitioTemp() {
        return tSitioTemp;
    }

    public void setTSitioTemp(String tSitioTemp) {
        this.tSitioTemp = tSitioTemp;
    }

    public String getTClasificacionTemp() {
        return tClasificacionTemp;
    }

    public void setTClasificacionTemp(String tClasificacionTemp) {
        this.tClasificacionTemp = tClasificacionTemp;
    }

    public Integer getSVFrecuenciaRespi() {
        return sVFrecuenciaRespi;
    }

    public void setSVFrecuenciaRespi(Integer sVFrecuenciaRespi) {
        this.sVFrecuenciaRespi = sVFrecuenciaRespi;
    }

    public Integer getSVFrecuenciaCardia() {
        return sVFrecuenciaCardia;
    }

    public void setSVFrecuenciaCardia(Integer sVFrecuenciaCardia) {
        this.sVFrecuenciaCardia = sVFrecuenciaCardia;
    }

    public String getSVClasifiFreRes() {
        return sVClasifiFreRes;
    }

    public void setSVClasifiFreRes(String sVClasifiFreRes) {
        this.sVClasifiFreRes = sVClasifiFreRes;
    }

    public String getSVClasifiFreCar() {
        return sVClasifiFreCar;
    }

    public void setSVClasifiFreCar(String sVClasifiFreCar) {
        this.sVClasifiFreCar = sVClasifiFreCar;
    }

    public String getPielAnexos() {
        return pielAnexos;
    }

    public void setPielAnexos(String pielAnexos) {
        this.pielAnexos = pielAnexos;
    }

    public String getPASitioToma() {
        return pASitioToma;
    }

    public void setPASitioToma(String pASitioToma) {
        this.pASitioToma = pASitioToma;
    }

    public Integer getPASistolica() {
        return pASistolica;
    }

    public void setPASistolica(Integer pASistolica) {
        this.pASistolica = pASistolica;
    }

    public String getPAPosicionToma() {
        return pAPosicionToma;
    }

    public void setPAPosicionToma(String pAPosicionToma) {
        this.pAPosicionToma = pAPosicionToma;
    }

    public Integer getPAMedia() {
        return pAMedia;
    }

    public void setPAMedia(Integer pAMedia) {
        this.pAMedia = pAMedia;
    }

    public Integer getPADiastolica() {
        return pADiastolica;
    }

    public void setPADiastolica(Integer pADiastolica) {
        this.pADiastolica = pADiastolica;
    }

    public String getPAClasificacionPa() {
        return pAClasificacionPa;
    }

    public void setPAClasificacionPa(String pAClasificacionPa) {
        this.pAClasificacionPa = pAClasificacionPa;
    }

    public String getOsteomuscular() {
        return osteomuscular;
    }

    public void setOsteomuscular(String osteomuscular) {
        this.osteomuscular = osteomuscular;
    }

    public Integer getOSaturaSinO() {
        return oSaturaSinO;
    }

    public void setOSaturaSinO(Integer oSaturaSinO) {
        this.oSaturaSinO = oSaturaSinO;
    }

    public Integer getOSaturaConO() {
        return oSaturaConO;
    }

    public void setOSaturaConO(Integer oSaturaConO) {
        this.oSaturaConO = oSaturaConO;
    }

    public String getOClasificacionSinO() {
        return oClasificacionSinO;
    }

    public void setOClasificacionSinO(String oClasificacionSinO) {
        this.oClasificacionSinO = oClasificacionSinO;
    }

    public String getOClasificacionConO() {
        return oClasificacionConO;
    }

    public void setOClasificacionConO(String oClasificacionConO) {
        this.oClasificacionConO = oClasificacionConO;
    }

    public String getNeurologicos() {
        return neurologicos;
    }

    public void setNeurologicos(String neurologicos) {
        this.neurologicos = neurologicos;
    }

    public Integer getMAtalla() {
        return mAtalla;
    }

    public void setMAtalla(Integer mAtalla) {
        this.mAtalla = mAtalla;
    }

    public Integer getMAindiMasaCopo() {
        return mAindiMasaCopo;
    }

    public void setMAindiMasaCopo(Integer mAindiMasaCopo) {
        this.mAindiMasaCopo = mAindiMasaCopo;
    }

    public Integer getMAPeso() {
        return mAPeso;
    }

    public void setMAPeso(Integer mAPeso) {
        this.mAPeso = mAPeso;
    }

    public Integer getMAPerimeAbdominal() {
        return mAPerimeAbdominal;
    }

    public void setMAPerimeAbdominal(Integer mAPerimeAbdominal) {
        this.mAPerimeAbdominal = mAPerimeAbdominal;
    }

    public String getMAClasificacion() {
        return mAClasificacion;
    }

    public void setMAClasificacion(String mAClasificacion) {
        this.mAClasificacion = mAClasificacion;
    }

    public Integer getGglucometria() {
        return gglucometria;
    }

    public void setGglucometria(Integer gglucometria) {
        this.gglucometria = gglucometria;
    }

    public String getGenitourinario() {
        return genitourinario;
    }

    public void setGenitourinario(String genitourinario) {
        this.genitourinario = genitourinario;
    }

    public Boolean getGPreprandial() {
        return gPreprandial;
    }

    public void setGPreprandial(Boolean gPreprandial) {
        this.gPreprandial = gPreprandial;
    }

    public Boolean getGPospandrial() {
        return gPospandrial;
    }

    public void setGPospandrial(Boolean gPospandrial) {
        this.gPospandrial = gPospandrial;
    }

    public String getGClasificacionGlucome() {
        return gClasificacionGlucome;
    }

    public void setGClasificacionGlucome(String gClasificacionGlucome) {
        this.gClasificacionGlucome = gClasificacionGlucome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCabezaCuello() {
        return cabezaCuello;
    }

    public void setCabezaCuello(String cabezaCuello) {
        this.cabezaCuello = cabezaCuello;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}