package com.renwei.Constructor;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.Constructor
 * @Author: renwei
 * @CreateTime: 2024-04-17  17:13
 * @Description: TODO
 * @Version: 1.0
 */
public class Cow {
	private Integer id;
	private String name;
	private Integer age;

	public Cow(Integer id, Integer age, String name) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Fruit eat() {
		return new Apple();
	}
}
