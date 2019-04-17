package com.athangzhou.bean;

import org.springframework.beans.factory.FactoryBean;

public class ColorFactoryBean implements FactoryBean<Color>{

	@Override
	public Color getObject() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("这里调用factory bean 创建 color");
		return new Color();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Color.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
