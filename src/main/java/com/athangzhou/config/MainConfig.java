package com.athangzhou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Lazy;

import com.athangzhou.bean.Color;
import com.athangzhou.bean.ColorFactoryBean;
import com.athangzhou.bean.Person;
import com.athangzhou.condition.MyImportBeanDefinitions;
import com.athangzhou.condition.MyImportSelector;
import com.athangzhou.condition.WindowsCondition;

//配置类
@Conditional({WindowsCondition.class})
@Configuration
@Import({Color.class,MyImportSelector.class,MyImportBeanDefinitions.class})
public class MainConfig {

	@Lazy
	@Bean("person")
	public Person person()
	{
		return new Person(20,"zhangsan");
	}
	
	/**
	 * @Conditional 按照一定条件注册bean
	 * 如果是windows 就注入bill
	 * */
	@Bean("harry")
	public Person person01()
	{
		return new Person(33,"Harry");
	}
	
	@Conditional({WindowsCondition.class})
	@Bean("bill")
	public Person person02()
	{
		return new Person(62,"Bill Gates");
	}

	/**
	 *给容器注册注解
	 *1.包注解+组件注解（@Controller, @Service @Repository @Component)
	 *2.@Bean 导入第三方包里面的组件
	 *3.@Import 快速给容器中导入一个组件
	 * 	a. @Import({要导入的组件，id是默认的全类名})
	 *  b.@ImportSelector: 返回需要导入类的全类名的
	 *  c. @ImportDefinitionBeanRegistrar
	 *4.使用Spring 提供的FactoryBean
	 * 	获取到的是工厂bean创建的对象 getObject
	 *  要获取工厂bean本身，要在id前面加& 标识
	 * 
	 */
	
	@Bean
	public ColorFactoryBean colorFactoryBean()
	{
		return new ColorFactoryBean();
	}
}
