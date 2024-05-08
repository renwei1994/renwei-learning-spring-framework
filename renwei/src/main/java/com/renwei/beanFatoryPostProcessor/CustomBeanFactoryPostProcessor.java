package com.renwei.beanFatoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.beanFatoryPostProcessor
 * @Author: renwei
 * @CreateTime: 2024-03-12  14:48
 * @Description: TODO
 * @Version: 1.0
 */
//@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.err.println("执行 CustomBeanFactoryPostProcessor 。。 postProcessBeanFactory");
	}
}
