package com.athangzhou.config;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.athangzhou.bean.Car;
import com.athangzhou.lifebean.Home;

@Configuration
@ComponentScan("com.athangzhou.lifebean")
public class MainConfigOfHome {

		/**
		 *1 @bean 注解 指定初始化和销毁
		 * 单实例可以init 也可以destroy
		 * 多实例的不会销毁，容器不会管理多实例bean，只会创建
		 * 
		 * 2 InInitializingBean,DisposableBean 接口
		 * 3.@PostConstruct 创建完成，后执行
		 *   @PreDestory bean 从容器中移除之前
		 * 4. BeanPostProcessor bean初始化前后处理一些方法
		 * 
		 */
	    
	    //@Scope("prototype")
	    @Bean(initMethod="init",destroyMethod="destory")
		public Home home() {
	    	return new Home(4,"hangzhou");
	    	
		}
}
