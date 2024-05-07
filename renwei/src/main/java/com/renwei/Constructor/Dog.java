package com.renwei.Constructor;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.Constructor
 * @Author: renwei
 * @CreateTime: 2024-04-17  14:17
 * @Description: TODO
 * @Version: 1.0
 */
public class Dog {
	private Integer id;
	private String name;
	private Integer age;

	public Dog() {
	}

	public Dog(Integer id) {
		this.id = id;
	}

	public Dog(Integer id, Integer age, String name) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Dog(Integer id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

