package com.athangzhou;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.athangzhou.bean.Boss;
import com.athangzhou.bean.Car;
import com.athangzhou.config.MainConfigOfAutowired;
import com.athangzhou.config.MainConfigOfLifeCycle;
import com.athangzhou.dao.BookDao;
import com.athangzhou.service.BookService;

public class IOCTest_Autowired {
	
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
		
	@Test
	public void test01() {
		
		/*BookService bookService = applicationContext.getBean(BookService.class);
		//System.out.println(bookService);
		
		BookDao bookDao = applicationContext.getBean(BookDao.class);
		//System.out.println(bookDao);
		
		Boss boss = applicationContext.getBean(Boss.class);
		System.out.println("123======="+boss);
		
		Car car = applicationContext.getBean(Car.class);
		System.out.println(car);*/
		
	}

}
