package com.athangzhou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.athangzhou.dao.BookDao;


/*
 * 
 * 自动注入
 * 1） @Autowired
 * 		默认优先按照类型去容器中找类型
 *      如果找到多个，按照属性名去容器中查找
 *      @Qualifier 通过这个指定要的bean
 *      如果找不到，默认会报错
 *      
 * 
 *  	BookService
 *  {
 *  	@Autowired
 *  	private BookDao bookdao；
 *  }
 * 
 * JSR250  @Resouce  java 规范
 * JSR330  @Inject   java 规范
 * 
 * @Autowired 可以放在变量上
 * @Autowired 可以放在setter 方法上
 * @Autowired 可以放在构造器上,如果组件只有一个有参构造器，这里的@Autowired可以省略
 * 
 * */
@Configuration
@ComponentScan({"com.athangzhou.controller","com.athangzhou.service","com.athangzhou.dao","com.athangzhou.bean"})
public class MainConfigOfAutowired {

	@Primary
	@Bean("bookDao2")
	public BookDao bookDao() {
		BookDao bookDao = new BookDao();
		bookDao.setLabel("2");
		return bookDao;
	}
}
