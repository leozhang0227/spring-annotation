package com.athangzhou;

import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.athangzhou.bean.Person;
import com.athangzhou.bean.Red;
import com.athangzhou.config.MainConfig;

public class IOCTest {
	
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
	private Object bean;
	@Test
	public void testImport() {
		printBeans(applicationContext);
		Class<Red> requiredType = Red.class;
		Red red = applicationContext.getBean(requiredType);
		System.out.println(red);
		bean = applicationContext.getBean("colorFactoryBean");
		System.out.println(bean);
		bean = applicationContext.getBean("colorFactoryBean");
		System.out.println(bean);
		bean = applicationContext.getBean("&colorFactoryBean");
		System.out.println(bean.getClass());
	}
	
	private void printBeans(AnnotationConfigApplicationContext applicationContext)
	{
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for (String name:definitionNames) {
			System.out.println(name);
		}
	}
	
	@Test
	@Ignore
	public void test03() {
		String[] namesforType = applicationContext.getBeanNamesForType(Person.class);
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String property = environment.getProperty("os.name");
		System.out.println(property);
		for(String name:namesforType)
		{
			System.out.println(name);
		}
		Map<String, Person> persons =  applicationContext.getBeansOfType(Person.class);
		System.out.println(persons);
	}

}
