package com.athangzhou.config;

import org.springframework.aop.framework.DefaultAopProxyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
 * AOP:指在程序运行期间动态地将某段代码切入指定的位置执行
 * 
 * 1.导入依赖  spring-aspects
 * 2.写个业务逻辑 mathcalculator
 * 3.定义一个切面日志类
 * 4.	通知方法
 * 		前置@Before  logStart 目标方法运行之前
 * 		后置 @After logEnd   目标方法运行之后
 * 		返回  @AfterReturning logReturn 正常返回后
 * 		异常  @AfterThrowing logError  目标方法运行异常后
 * 		环绕  @Around 动态代理，手动推进目标方法运行 joinPoint.procced()
 * 
 * 5.切面类，业务逻辑都加入到容器@Aspect
 * 6.在给切面类加入一个注解
 * 7.EnableAspectJAutoProxy， 启用注解的切面代理
 * 
 * */
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.athangzhou.aop.LogAspects;
import com.athangzhou.aop.MathCalculator;

@EnableAspectJAutoProxy
@Configuration
public class MainConfigOfAOP {
	
	//业务逻辑加入容器
	@Bean
	public MathCalculator mathCalculator()
	{
		return new MathCalculator();
	}
	
	//切面类也加入容器
	@Bean
	public LogAspects logAspects() {
		return new LogAspects();
	}

}
