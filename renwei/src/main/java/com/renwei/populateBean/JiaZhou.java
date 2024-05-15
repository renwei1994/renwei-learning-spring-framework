package com.renwei.populateBean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

public class JiaZhou {
	private int id;

	private int age;

	private Address address;

	private Map<String, School> maps;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Map<String, School> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, School> maps) {
		this.maps = maps;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
