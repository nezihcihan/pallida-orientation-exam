package com.greenfox.exam.spring;

import org.h2.jdbcx.JdbcDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    private static final String TEMP_DIRECTORY = System.getProperty("java.io.tmpdir");
    @Bean(name = "licence_plates.sql")
    public DataSource createMainDataSource() {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:"+TEMP_DIRECTORY+"/testdata;MODE=MySQL");
        return ds;
    }

}
