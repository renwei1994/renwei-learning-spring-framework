package com.renwei.test;

import com.renwei.override.FruitFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.test
 * @Author: renwei
 * @CreateTime: 2024-04-03  09:37
 * @Description: TODO
 * @Version: 1.0
 */
public class OverrideMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("renwei-spring08.xml");
		FruitFactory fruitFactory1 = (FruitFactory) applicationContext.getBean("fruitFactory1");
		fruitFactory1.getFruit();

		FruitFactory fruitFactory2 = (FruitFactory) applicationContext.getBean("fruitFactory2");
		fruitFactory2.getFruit();
	}

}
