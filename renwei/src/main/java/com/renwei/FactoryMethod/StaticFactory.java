package com.renwei.FactoryMethod;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.FactoryMethod
 * @Author: renwei
 * @CreateTime: 2024-04-16  15:29
 * @Description: TODO
 * @Version: 1.0
 */
public class StaticFactory {
	public static Cat getCat() {
		Cat cat = new Cat();
		cat.setName("小花");
		cat.setAge(1);
		cat.setId(1);
		return cat;
	}

	public static Cat getCat(Integer age, String name) {
		Cat cat = new Cat();
		cat.setName(name);
		cat.setAge(age);
		cat.setId(2);
		return cat;
	}

	public static Cat getCat(String name, Integer age) {
		Cat cat = new Cat();
		cat.setName(name);
		cat.setAge(age);
		cat.setId(2);
		return cat;
	}
}
