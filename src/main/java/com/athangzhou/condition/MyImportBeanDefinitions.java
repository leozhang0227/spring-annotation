package com.athangzhou.condition;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.athangzhou.bean.RainBow;

public class MyImportBeanDefinitions implements ImportBeanDefinitionRegistrar{

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
		// annotationMetadata 当前类的注解信息
	    
		boolean definition = registry.containsBeanDefinition("com.athangzhou.bean.Red");
		boolean definition2 = registry.containsBeanDefinition("com.athangzhou.bean.Color");
		if(definition&&definition2)
		{
			BeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
			registry.registerBeanDefinition("rainBow",beanDefinition);
		}
		
	}

}
