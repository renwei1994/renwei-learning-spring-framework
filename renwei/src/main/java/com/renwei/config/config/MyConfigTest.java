package com.renwei.config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.config.config
 * @Author: renwei
 * @CreateTime: 2024-04-03  16:07
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class MyConfigTest {
	@Bean
	public A a(){
		return new A();
	}

	@Bean
	public B b(){
		a();
		return new B();
	}
}



