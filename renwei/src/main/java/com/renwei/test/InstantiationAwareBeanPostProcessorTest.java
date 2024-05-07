package com.renwei.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.test
 * @Author: renwei
 * @CreateTime: 2024-04-16  11:22
 * @Description: TODO
 * @Version: 1.0
 */
public class InstantiationAwareBeanPostProcessorTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("renwei-spring12.xml");
		Object myInstantiationAwareBean = applicationContext.getBean("myInstantiationAwareBean");
		System.out.println();
	}
}
