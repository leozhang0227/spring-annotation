package com.athangzhou;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.athangzhou.aop.MathCalculator;
import com.athangzhou.bean.Boss;
import com.athangzhou.bean.Car;
import com.athangzhou.config.MainConfigExt;
import com.athangzhou.config.MainConfigOfAOP;
import com.athangzhou.config.MainConfigOfAutowired;
import com.athangzhou.config.MainConfigOfLifeCycle;
import com.athangzhou.dao.BookDao;
import com.athangzhou.service.BookService;

public class IOCTest_EXT {
	
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigExt.class);
		
	@Test
	public void test01() {
		
	}

}
