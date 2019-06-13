package org.oc.escalade.webapp;

import javax.sql.DataSource;

import org.oc.escalade.modele.Utilisateur;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="org.oc.escalade.consumer")
public class ApplicationConfiguration {
	
static final String JDBC_Driver = "org.postgresql.Driver";
static final String DB_URL = "jdbc:postgresql://localhost:5432/OcSacalade";
static final String USER = "postgres";
static final String PASS = "happyface2";


	
	@Bean
	public DataSource PostGreDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(JDBC_Driver);
		dataSource.setUrl(DB_URL);
		dataSource.setUsername("USER");
		dataSource.setPassword("PASS");
		return dataSource;
	}
	
}
