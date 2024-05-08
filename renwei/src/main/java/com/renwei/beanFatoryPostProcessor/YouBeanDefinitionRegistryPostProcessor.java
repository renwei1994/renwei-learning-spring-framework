package com.renwei.beanFatoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.beanFatoryPostProcessor
 * @Author: renwei
 * @CreateTime: 2024-03-11  16:57
 * @Description: TODO
 * @Version: 1.0
 */

public class YouBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor , PriorityOrdered {
	@Override
	public int getOrder() {
		return 0;
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.err.println("YouBeanDefinitionRegistryPostProcessor -- postProcessBeanDefinitionRegistry");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.err.println("YouBeanDefinitionRegistryPostProcessor -- postProcessBeanFactory");
	}
}
