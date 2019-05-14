package com.athangzhou.aop;

import java.util.Arrays;

import javax.swing.JPanel;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.orm.jpa.JpaDialect;

@Aspect
public class LogAspects {
	
	//抽取公共切入点
	//git
	
	@Pointcut("execution(public int com.athangzhou.aop.MathCalculator.*(..))")
	public void pointCut() {}
	
	
	@Before("pointCut()")
	public void logStart(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName() +"开始运行之前： 参数列表{"+ Arrays.asList(joinPoint.getArgs())+"}");
	}
	
	
	
	@After("com.athangzhou.aop.LogAspects.pointCut()")
	public void logEnd(JoinPoint joinPoint){
		System.out.println("除法结束" +joinPoint.getSignature().getName());
	}
	
	@AfterReturning(value="pointCut()",returning="result")
	public void logReturn(Object result) {
		System.out.println("除法正常return，结果：{"+result+"}");
	
	}
	
	@Around(value = "pointCut()")
	public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("环绕之前");
		Object result = proceedingJoinPoint.proceed();
		System.out.println("环绕之后==="+result);
		return result;

	}
	
	@AfterThrowing(value= "pointCut()",throwing="exception")
	public void logError(JoinPoint jPoint,Exception exception)
	{
		System.out.println("除法出错，{}"+exception.toString());
	}

}
