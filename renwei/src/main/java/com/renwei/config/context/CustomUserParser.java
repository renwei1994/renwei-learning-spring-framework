package com.renwei.config.context;


import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.config.context
 * @Author: renwei
 * @CreateTime: 2024-03-05  15:31
 * @Description: TODO
 * @Version: 1.0
 */
public class CustomUserParser extends AbstractSingleBeanDefinitionParser {
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element,  BeanDefinitionBuilder builder) {
		String id = element.getAttribute("id");
		String name = element.getAttribute("name");
		String password = element.getAttribute("password");
		String email = element.getAttribute("email");

		if (id != null && !id.isEmpty()) {
			builder.addPropertyValue("id", id);
		}
		if (name != null && !name.isEmpty()) {
			builder.addPropertyValue("name", name);
		}
		if (password != null && !password.isEmpty()) {
			builder.addPropertyValue("password", password);
		}
		if (email != null && !email.isEmpty()) {
			builder.addPropertyValue("email", email);
		}
	}
}
