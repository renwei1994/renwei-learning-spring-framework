package com.renwei.Supplier;

import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.Supplier
 * @Author: renwei
 * @CreateTime: 2024-04-16  15:10
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class SupplierBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
