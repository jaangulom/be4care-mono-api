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
@Table(name = "config_adicional_var")
@Entity
public class ConfigAdicionalVar {
    @JmixGeneratedValue
    @Column(name = "id", nullable = false)
    @Id
    private UUID id;

    @Column(name = "bloqueo_disp_diadema")
    private Boolean bloqueoDispDiadema;

    @Column(name = "bloqueo_disp_manilla")
    private Boolean bloqueoDispManilla;

    @Column(name = "bloqueo_menu_fisio")
    private Boolean bloqueoMenuFisio;

    @Column(name = "bloqueo_perfil_edit")
    private Boolean bloqueoPerfilEdit;

    @Column(name = "empresa_id")
    private String empresa;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private JhiUser user;

    @Column(name = "variable_1")
    private String variable1;

    @Column(name = "variable_2")
    private String variable2;

    @Column(name = "variable_3")
    private String variable3;

    @Column(name = "variable_4")
    private String variable4;

    public String getVariable4() {
        return variable4;
    }

    public void setVariable4(String variable4) {
        this.variable4 = variable4;
    }

    public String getVariable3() {
        return variable3;
    }

    public void setVariable3(String variable3) {
        this.variable3 = variable3;
    }

    public String getVariable2() {
        return variable2;
    }

    public void setVariable2(String variable2) {
        this.variable2 = variable2;
    }

    public String getVariable1() {
        return variable1;
    }

    public void setVariable1(String variable1) {
        this.variable1 = variable1;
    }

    public JhiUser getUser() {
        return user;
    }

    public void setUser(JhiUser user) {
        this.user = user;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Boolean getBloqueoPerfilEdit() {
        return bloqueoPerfilEdit;
    }

    public void setBloqueoPerfilEdit(Boolean bloqueoPerfilEdit) {
        this.bloqueoPerfilEdit = bloqueoPerfilEdit;
    }

    public Boolean getBloqueoMenuFisio() {
        return bloqueoMenuFisio;
    }

    public void setBloqueoMenuFisio(Boolean bloqueoMenuFisio) {
        this.bloqueoMenuFisio = bloqueoMenuFisio;
    }

    public Boolean getBloqueoDispManilla() {
        return bloqueoDispManilla;
    }

    public void setBloqueoDispManilla(Boolean bloqueoDispManilla) {
        this.bloqueoDispManilla = bloqueoDispManilla;
    }

    public Boolean getBloqueoDispDiadema() {
        return bloqueoDispDiadema;
    }

    public void setBloqueoDispDiadema(Boolean bloqueoDispDiadema) {
        this.bloqueoDispDiadema = bloqueoDispDiadema;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}