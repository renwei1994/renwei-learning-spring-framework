package com.renwei.override;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.override
 * @Author: renwei
 * @CreateTime: 2024-04-03  09:31
 * @Description: TODO
 * @Version: 1.0
 */
public class Banana extends Fruit{
	@Override
	public void eat() {
		System.out.println("eat banana");
	}
}
