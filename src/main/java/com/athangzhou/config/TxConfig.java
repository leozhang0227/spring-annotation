package com.athangzhou.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.StringValueResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@EnableTransactionManagement
@Configuration
@PropertySource("classpath:/db.properties")
@ComponentScan("com.athangzhou.tx")
public class TxConfig implements EmbeddedValueResolverAware{
	
	@Value("${db.user}")
	private String user;
	
	@Value("${db.password}")
	private String pwd;
	private StringValueResolver valueResolver;
	
	@Bean
	public DataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setUser(user);
		comboPooledDataSource.setPassword(pwd);
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/sql_learning");
		String driverClass = valueResolver.resolveStringValue("${db.driverClass}");
		comboPooledDataSource.setDriverClass(driverClass);
		return comboPooledDataSource;
	}
	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		// TODO Auto-generated method stub
		
		this.valueResolver = resolver;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
		JdbcTemplate jdbcTemplate = null;
		try {
			jdbcTemplate = new JdbcTemplate(dataSource());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jdbcTemplate;
	}
	
	@Bean
	public PlatformTransactionManager transactionManager () throws PropertyVetoException {
		return new DataSourceTransactionManager(dataSource());
	}

}
