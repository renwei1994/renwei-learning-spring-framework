package com.renwei.config.context;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.config.context
 * @Author: renwei
 * @CreateTime: 2024-03-06  09:39
 * @Description: TODO
 * @Version: 1.0
 */
public class CustomeRwHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		// rw 标签被解析
		registerBeanDefinitionParser("rw", new CustomeRwParser());
	}
}
