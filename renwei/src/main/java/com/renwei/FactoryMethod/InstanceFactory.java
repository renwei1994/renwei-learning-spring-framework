package com.renwei.FactoryMethod;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.FactoryMethod
 * @Author: renwei
 * @CreateTime: 2024-04-16  15:31
 * @Description: TODO
 * @Version: 1.0
 */
public class InstanceFactory {
	public Cat getCat() {
		Cat cat = new Cat();
		cat.setName("小黑");
		cat.setAge(2);
		cat.setId(2);
		return cat;
	}
	public Cat getCat(Integer age, String name) {
		Cat cat = new Cat();
		cat.setName(name);
		cat.setAge(age);
		cat.setId(2);
		return cat;
	}
	public Cat getCat(String name, Integer age) {
		Cat cat = new Cat();
		cat.setName(name);
		cat.setAge(age);
		cat.setId(2);
		return cat;
	}
}
