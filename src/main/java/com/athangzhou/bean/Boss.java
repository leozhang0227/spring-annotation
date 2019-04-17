package com.athangzhou.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boss {

	private Car car;

	//@Autowired
	public Boss(Car car) {
		
		super();
		System.out.println("constrcutor");
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	//@Autowired
	public void setCar(Car car) {
		System.out.println("set method");
		this.car = car;
	}

	@Override
	public String toString() {
		return "Boss [car=" + car + "]";
	}
	
	
}
