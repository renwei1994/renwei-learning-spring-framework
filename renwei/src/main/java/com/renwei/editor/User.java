package com.renwei.editor;

import com.renwei.entity.Address;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.entity
 * @Author: renwei
 * @CreateTime: 2023-12-22  09:40
 * @Description: TODO
 * @Version: 1.0
 */
public class User  {

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
}
