package com.renwei.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.beanPostProcessor
 * @Author: renwei
 * @CreateTime: 2024-03-29  10:30
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + ": this MyBeanPostProcessor postProcessBeforeInitialization");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + ": this MyBeanPostProcessor postProcessAfterInitialization");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
