package com.renwei.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.test
 * @Author: renwei
 * @CreateTime: 2024-04-16  09:19
 * @Description: TODO
 * @Version: 1.0
 */
public class MergedLocalBeanDefinitionTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("renwei-spring11.xml");
	}
}
