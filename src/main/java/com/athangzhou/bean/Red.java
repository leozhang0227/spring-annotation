package com.athangzhou.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class Red implements EmbeddedValueResolverAware,BeanNameAware,ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("set application context");
		
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("当前bean的name="+arg0);
		
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		// TODO Auto-generated method stub
		String resolveStringValue = resolver.resolveStringValue("你好${os.name} 我是#{20*10}");		
		System.out.println(resolveStringValue);
	}

}
