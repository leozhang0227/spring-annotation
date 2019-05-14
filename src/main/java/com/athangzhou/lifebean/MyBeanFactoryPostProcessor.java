package com.athangzhou.lifebean;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	
	public MyBeanFactoryPostProcessor() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("【BeanFactoryPostProcessor】的构造方法----被调用");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("【BeanFactoryPostProcessor】的【postProcessBeanFactory】方法----被调用");
		
		/*int  count = beanFactory.getBeanDefinitionCount();
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		
		System.out.println("the beanFactory has "+count +"beans");
		System.out.println(Arrays.asList(beanDefinitionNames));*/
	}

}
