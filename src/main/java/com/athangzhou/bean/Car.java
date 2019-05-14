package com.athangzhou.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Car implements InitializingBean,DisposableBean, BeanFactoryAware,BeanNameAware{

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("car...disposableBean...");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("car...initializing bean..");
		
	}


	public Car() {
		System.out.println("car constructor ...");
	}

	
	public void init()
	{
		System.out.println("car init...");
	}
	
	public void destory()
	{
		System.out.println("car destory...");
	}
	
	@PostConstruct
	public void init2()
	{
		System.out.println("@postConstruct");
	}
	
	@PreDestroy
	public void preDestory()
	{
		System.out.println("@preDestory");
	}


	@Override
	public void setBeanName(String name) {
		System.out.println("【BeanNameAware接口】调用BeanNameAware.setBeanName()");		
		
	}


	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		 System.out.println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
		
	}

}
