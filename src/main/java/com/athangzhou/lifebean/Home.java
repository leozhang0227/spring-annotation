package com.athangzhou.lifebean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;



public class Home implements InitializingBean,DisposableBean,BeanFactoryAware,BeanNameAware{
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("【DisposableBean】的destory方法----被调用");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("【InitializingBean】的afterPropertiesSet方法----被调用");
		
	}
	private int rooms;
	private String location;
	public Home(int rooms, String location) {
		super();
		System.out.println("Home 的构造函数---被调用");
		this.rooms = rooms;
		this.location = location;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		System.out.println("set home 属性 方法----被调用");
		this.rooms = rooms;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void init()
	{
		System.out.println("init Method 方法----被调用");
	}
	public void destory()
	{
		System.out.println("destory method 方法----被调用");
	}
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("【BeanNameAware】的setBeanName方法----被调用");
		
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("【BeanFactoryAware】的setBeanFactory方法----被调用");
	}

}
