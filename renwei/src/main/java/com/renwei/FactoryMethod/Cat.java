package com.renwei.FactoryMethod;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.FactoryMethod
 * @Author: renwei
 * @CreateTime: 2024-04-16  15:29
 * @Description: TODO
 * @Version: 1.0
 */
public class Cat {
	private Integer id;
	private String name;
	private Integer age;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
