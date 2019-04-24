package com.athangzhou.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.athangzhou.bean.Red;

@ComponentScan("com.athangzhou.ext")
@Configurable
public class MainConfigExt {
	
	@Bean
	public Red red() {
		return new Red();
	}

}
