package com.athangzhou;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.athangzhou.bean.Person;
import com.athangzhou.config.MainConfig;

public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Person bean = (Person) applicationContext.getBean("person");
		System.out.println(bean);
	}
}
