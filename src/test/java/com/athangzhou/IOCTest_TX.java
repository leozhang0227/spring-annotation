package com.athangzhou;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.athangzhou.aop.MathCalculator;
import com.athangzhou.bean.Boss;
import com.athangzhou.bean.Car;
import com.athangzhou.config.MainConfigOfAOP;
import com.athangzhou.config.MainConfigOfAutowired;
import com.athangzhou.config.MainConfigOfLifeCycle;
import com.athangzhou.config.TxConfig;
import com.athangzhou.dao.BookDao;
import com.athangzhou.service.BookService;
import com.athangzhou.tx.UserService;

public class IOCTest_TX {
	
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
		
	@Test
	public void test01() {
		
		UserService userService  = applicationContext.getBean(UserService.class);
		userService.insertUser();
		
		applicationContext.close();
		
	}

}
