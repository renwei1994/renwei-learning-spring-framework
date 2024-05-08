package com.renwei.config.context;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.config.context
 * @Author: renwei
 * @CreateTime: 2024-03-05  15:28
 * @Description: TODO
 * @Version: 1.0
 */
public class CustomUserHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new CustomUserParser());
	}
}
