package com.athangzhou.aop.introduction;

public class NavieWaiter implements Waiter {

	public NavieWaiter() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("NavieWaiter is constructed");
	}

	@Override
	public void greetTo(String clientName) {
		// TODO Auto-generated method stub
		System.out.println("NavieWaiter:greeting "+clientName);
	}

	@Override
	public void serveTo(String clientName) {
		// TODO Auto-generated method stub
		System.out.println("NavieWaiter:serve");
	}

}
