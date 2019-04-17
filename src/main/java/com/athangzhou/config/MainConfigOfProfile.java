package com.athangzhou.config;



import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import com.athangzhou.bean.Red;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/*
 * Profile
 * 
 * Spring为我们提供的可以根据当前环境，动态的激活和切换一系列组件的功能
 * 开发，测试，生产
 * 
 * 数据库 dev test pro
 * 
 * @Profile
 * 
 * 也可以写在类上，只有是这个指定的环境，所有配置才能生效
 * 只要配置类生效，没有制定profile的都会加载
 * */
@Profile("test")
@PropertySource("classpath:/db.properties")
@Configuration
public class MainConfigOfProfile implements EmbeddedValueResolverAware{

	
	
	@Value("${db.user}")
	private String user;
	
	private StringValueResolver valueResolver;
	

	@Bean("red")
	public Red red() {
		return new Red();
	}	
	
	@Profile("dev")
	@Bean("devDataSource")
	public DataSource dataSource(@Value("db.password") String pwd)  throws PropertyVetoException {
			ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
			comboPooledDataSource.setUser(user);
			comboPooledDataSource.setPassword(pwd);
			comboPooledDataSource.setJdbcUrl("jdbc:mysql://10.61.213.104:3306/sql_learning");
			String driverClass = valueResolver.resolveStringValue("${db.driverClass}");
			comboPooledDataSource.setDriverClass(driverClass);
			return comboPooledDataSource;
		}
	
	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		// TODO Auto-generated method stub
		this.valueResolver = resolver;
		
	}
	@Profile("test")
	@Bean("testDataSource")
	public DataSource dataSourcetest(@Value("db.password") String pwd) throws PropertyVetoException {
			ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
			comboPooledDataSource.setUser(user);
			comboPooledDataSource.setPassword(pwd);
			comboPooledDataSource.setJdbcUrl("jdbc:mysql://10.61.213.104:3306/university_tool");
			String driverClass = valueResolver.resolveStringValue("${db.driverClass}");
			comboPooledDataSource.setDriverClass(driverClass);
			return comboPooledDataSource;
		}
}
