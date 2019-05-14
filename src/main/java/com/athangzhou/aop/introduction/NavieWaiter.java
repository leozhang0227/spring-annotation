package com.athangzhou.aop.introduction;

public class NavieWaiter implements Waiter {

	@Override
	public void greetTo(String clientName) {
		// TODO Auto-generated method stub
		System.out.println("NavieWaiter:greeting");
	}

	@Override
	public void serveTo(String clientName) {
		// TODO Auto-generated method stub
		System.out.println("NavieWaiter:serve");
	}

}
