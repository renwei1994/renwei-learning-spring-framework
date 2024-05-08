package com.renwei.Constructor;


/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.override
 * @Author: renwei
 * @CreateTime: 2024-04-03  09:30
 * @Description: TODO
 * @Version: 1.0
 */
public class Apple extends Fruit {
	@Override
	public void eat() {
		System.out.println("eat apple");
	}
}
