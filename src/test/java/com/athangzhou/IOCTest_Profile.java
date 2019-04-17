package com.athangzhou;

import java.util.Iterator;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.athangzhou.bean.Boss;
import com.athangzhou.bean.Car;
import com.athangzhou.config.MainConfigOfAutowired;
import com.athangzhou.config.MainConfigOfLifeCycle;
import com.athangzhou.config.MainConfigOfProfile;
import com.athangzhou.dao.BookDao;
import com.athangzhou.service.BookService;

public class IOCTest_Profile {
	
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
	//1.使用命令行参数 -Dspring.profiles.active=test	
	//2.使用代码激活一个环境setActiveProfiles
	@Test
	public void test01() {
		
		applicationContext.getEnvironment().setActiveProfiles("test");
		applicationContext.register(MainConfigOfProfile.class);
		applicationContext.refresh();
		
		String[] beanNamesForType = applicationContext.getBeanNamesForType(DataSource.class);
		
		for(String name:beanNamesForType)
		{
			System.out.println(name);
		}
		
	}

}
