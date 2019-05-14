package com.athangzhou.aop.introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EnableSellerAspect {
	
	@DeclareParents(value="com.athangzhou.aop.introduction.NavieWaiter",defaultImpl=SmartSeller.class)
	public Seller seller;
}
