package com.renwei.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("renwei-spring18.xml");
		applicationContext.getBean("componentScanBeanDefinition");
	}
}
