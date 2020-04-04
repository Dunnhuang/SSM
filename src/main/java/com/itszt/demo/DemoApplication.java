package com.itszt.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.DispatcherServlet;

import javax.sql.DataSource;

@SpringBootApplication
public class DemoApplication {

    public static void main1(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @SpringBootApplication
    @MapperScan("com.itszt.demo.dao")
    public class Demosbjava32Application {
        //c3p0的DataSource
        @Bean(name = "dataSource")
        @Qualifier(value = "dataSource")
        @Primary
        @ConfigurationProperties(prefix = "c3p0")
        public DataSource dataSource() {
            return DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
        }

    }
}
