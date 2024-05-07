package com.renwei.config.context;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.config.context
 * @Author: renwei
 * @CreateTime: 2024-03-05  15:32
 * @Description: TODO
 * @Version: 1.0
 */
public class User {
	private String id;
	private String name;
	private String password;
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
