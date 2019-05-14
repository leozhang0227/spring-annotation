package com.athangzhou.lifebean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	  public MyBeanPostProcessor() {  
	        super();  
	        System.out.println("【BeanPostProcessor】的构造方法----被调用");          
	    }  
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("bean name= "+beanName+ " 【BeanPostProcessor】的【postProcessAfterInitialization】方法----被调用");          
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("bean name= "+beanName+ " 【BeanPostProcessor】的【postProcessBeforeInitialization】方法----被调用");          
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

}
