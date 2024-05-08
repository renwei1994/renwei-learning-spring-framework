package com.renwei.config.context;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.config.context
 * @Author: renwei
 * @CreateTime: 2024-03-06  09:32
 * @Description: TODO
 * @Version: 1.0
 */
public class CustomeRwParser extends AbstractSingleBeanDefinitionParser {
	/**
	 * 被这个解析器解析的Element 都会转换成一个Rw对象
	 *
	 * @param element the {@code Element} that is being parsed
	 * @return
	 */
	@Override
	protected Class<?> getBeanClass(Element element) {
		return Rw.class;
	}

	/**
	 * 具体解析过程：Element对应的节点映射到Rw对象对应的元素
	 *
	 * @param element the XML element being parsed
	 * @param builder used to define the {@code BeanDefinition}
	 */
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String id = element.getAttribute("id");
		String name = element.getAttribute("name");
		String email = element.getAttribute("email");
		if (StringUtils.hasText(id)) {
			builder.addPropertyValue("id", id);
		}
		if (StringUtils.hasText(name)) {
			builder.addPropertyValue("name", name);
		}
		if (StringUtils.hasText(email)) {
			builder.addPropertyValue("email", email);
		}
	}
}
