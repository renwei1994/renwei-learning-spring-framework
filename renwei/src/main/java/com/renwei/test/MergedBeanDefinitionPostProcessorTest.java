package com.renwei.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.test
 * @Author: renwei
 * @CreateTime: 2024-04-22  11:04
 * @Description: TODO
 * @Version: 1.0
 */
public class MergedBeanDefinitionPostProcessorTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("renwei-spring12.xml");
	}
}
