package com.athangzhou.ext;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("MyBeanFactoryPostProcessor ...");
		
		int  count = beanFactory.getBeanDefinitionCount();
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		
		System.out.println("the beanFactory has "+count +"beans");
		System.out.println(Arrays.asList(beanDefinitionNames));
	}

}
