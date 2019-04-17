package com.athangzhou;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.athangzhou.config.MainConfigOfLifeCycle;

public class IOCTestLifeCycle {

	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
	private Object bean;
	
	@Test
	public void test01() {
		
		System.out.println("容器创建完成");
		bean = applicationContext.getBean("car");
		System.out.println(bean);
		applicationContext.close();
		
	}
}
