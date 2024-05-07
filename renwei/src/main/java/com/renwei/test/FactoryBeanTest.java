package com.renwei.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.test
 * @Author: renwei
 * @CreateTime: 2024-04-16  09:57
 * @Description: TODO
 * @Version: 1.0
 */
public class FactoryBeanTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("renwei-spring07.xml");
		Object bean = applicationContext.getBean("myFactoryBean");
		Object bean1 = applicationContext.getBean("&myFactoryBean");
		System.out.println();
	}
}
