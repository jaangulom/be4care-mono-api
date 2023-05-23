package com.be4tech.b4caremonoapi;

import io.jmix.core.JmixModules;
import io.jmix.core.Resources;
import io.jmix.data.impl.JmixEntityManagerFactoryBean;
import io.jmix.data.impl.JmixTransactionManager;
import io.jmix.data.persistence.DbmsSpecifics;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
public class B4monoStoreConfiguration {

    @Bean
    @ConfigurationProperties("b4mono.datasource")
    DataSourceProperties b4monoDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "b4mono.datasource.hikari")
    DataSource b4monoDataSource(@Qualifier("b4monoDataSourceProperties") DataSourceProperties properties) {
        return properties.initializeDataSourceBuilder().build();
    }

    @Bean
    LocalContainerEntityManagerFactoryBean b4monoEntityManagerFactory(
            @Qualifier("b4monoDataSource") DataSource dataSource,
            JpaVendorAdapter jpaVendorAdapter,
            DbmsSpecifics dbmsSpecifics,
            JmixModules jmixModules,
            Resources resources) {
        return new JmixEntityManagerFactoryBean("b4mono", dataSource, jpaVendorAdapter, dbmsSpecifics, jmixModules, resources);
    }

    @Bean
    JpaTransactionManager b4monoTransactionManager(@Qualifier("b4monoEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JmixTransactionManager("b4mono", entityManagerFactory);
    }
}
