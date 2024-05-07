package com.renwei.test;

import com.renwei.Constructor.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.test
 * @Author: renwei
 * @CreateTime: 2024-04-17  11:48
 * @Description: TODO
 * @Version: 1.0
 */
public class ConstructorTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("renwei-spring14.xml");
//		Dog dog1 = applicationContext.getBean(Dog.class);
//		Dog dog2 = applicationContext.getBean(Dog.class);
	}
}
