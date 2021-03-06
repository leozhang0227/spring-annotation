package com.athangzhou;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.athangzhou.aop.MathCalculator;
import com.athangzhou.aop.introduction.NavieWaiter;
import com.athangzhou.aop.introduction.Seller;
import com.athangzhou.aop.introduction.Waiter;
import com.athangzhou.bean.Boss;
import com.athangzhou.bean.Car;
import com.athangzhou.config.MainConfigOfAOP;
import com.athangzhou.config.MainConfigOfAOPIntro;
import com.athangzhou.config.MainConfigOfAutowired;
import com.athangzhou.config.MainConfigOfLifeCycle;
import com.athangzhou.dao.BookDao;
import com.athangzhou.service.BookService;

public class IOCTest_AOPIntro {
	
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOPIntro.class);
		
	@Test
	public void test01() {
		
		Waiter navieWaiter = (Waiter)applicationContext.getBean("navieWaiter");
		navieWaiter.greetTo("Harry");
		
		Seller seller = (Seller) navieWaiter;
		seller.seller("banana", "Jack");
		
	}

}
