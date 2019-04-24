package com.athangzhou.ext;

import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

import com.athangzhou.bean.Red;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeanFactory .."+beanFactory.getBeanDefinitionCount());
		
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeanDefinitionRegistry..."+registry.getBeanDefinitionCount());
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Red.class);
		registry.registerBeanDefinition("blue", rootBeanDefinition);
		
		
	}

}
