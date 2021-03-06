package com.athangzhou.condition;


import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

//判断是否是windows
public class WindowsCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		ClassLoader classLoader = context.getClassLoader();
		Environment environment = context.getEnvironment();		
		BeanDefinitionRegistry beanDefinitionRegistry = context.getRegistry();
		
		String property = environment.getProperty("os.name");
		if(property.contains("Windows")) return true;
		return false;
	}
	
	
}
