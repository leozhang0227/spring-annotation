package com.athangzhou.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspects {
	
	//抽取公共切入点
	//git
	
	@Pointcut("execution(public int com.athangzhou.aop.MathCalculator.*(..))")
	public void pointCut() {}
	
	@Before("pointCut()")
	public void logStart() {
		System.out.println("除法开始运行之前： 参数列表{}");
	}
	
	@After("com.athangzhou.aop.LogAspects.pointCut()")
	public void logEnd(){
		System.out.println("除法结束");
	}
	
	@AfterReturning("pointCut()")
	public void logReturn() {
		System.out.println("除法正常return，结果：{}");
	
	}
	@Around("pointCut()")
	public void logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("环绕之前");
		proceedingJoinPoint.proceed();
		System.out.println("环绕之后");

	}
	@AfterThrowing("pointCut()")
	public void logError()
	{
		System.out.println("除法出错，{}");
	}

}
