package com.be4tech.b4caremonoapi.entity;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;
import io.jmix.data.DdlGeneration;

import javax.persistence.*;
import java.util.List;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Store(name = "b4mono")
@Table(name = "jhi_authority")
@Entity
public class JhiAuthority {
    @InstanceName
    @Column(name = "name", nullable = false, length = 50)
    @Id
    private String name;

    @JoinTable(name = "jhi_user_authority",
            joinColumns = @JoinColumn(name = "authority_name"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    @ManyToMany
    private List<JhiUser> jhiUser;

    public List<JhiUser> getJhiUser() {
        return jhiUser;
    }

    public void setJhiUser(List<JhiUser> jhiUser) {
        this.jhiUser = jhiUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}