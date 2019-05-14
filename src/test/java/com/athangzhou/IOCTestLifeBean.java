package com.athangzhou;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.athangzhou.config.MainConfigOfHome;
import com.athangzhou.config.MainConfigOfLifeCycle;

public class IOCTestLifeBean {

	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfHome.class);
	private Object bean;
	
	@Test
	public void test01() {
		
		System.out.println("容器创建完成");
		bean = applicationContext.getBean("home");
		System.out.println(bean);
		applicationContext.close();
		System.out.println("容器关闭");
		
	}
}
