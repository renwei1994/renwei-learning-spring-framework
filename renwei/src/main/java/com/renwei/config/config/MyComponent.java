package com.renwei.config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.config.config
 * @Author: renwei
 * @CreateTime: 2024-04-09  10:18
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class MyComponent {

	private  String name ;

	public MyComponent(String name) {
		this.name = name;
	}

	@Bean
	public A a(){
		return new A();
	}
}
