package com.renwei.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.test
 * @Author: renwei
 * @CreateTime: 2024-04-23  10:47
 * @Description: TODO
 * @Version: 1.0
 */
public class DeferredImportSelectorTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("renwei-spring16.xml");
	}
}
