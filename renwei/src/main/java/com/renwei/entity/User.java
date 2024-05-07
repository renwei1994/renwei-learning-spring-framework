package com.renwei.entity;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.entity
 * @Author: renwei
 * @CreateTime: 2023-12-22  09:40
 * @Description: TODO
 * @Version: 1.0
 */
public class User implements ApplicationContextAware {
	public ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.err.println("setApplicationContext");
	}

	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void test(){
		System.out.println("test");
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}
