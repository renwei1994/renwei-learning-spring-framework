package com.renwei.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.beanPostProcessor
 * @Author: renwei
 * @CreateTime: 2024-03-29  11:25
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanName.equals("myInstantiationAwareBean")) {
			return new ChengDu();
		} else {
			return null;
		}
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.err.println(beanName + ": this MyInstantiationAwareBeanPostProcessor postProcessAfterInstantiation");
		return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.err.println(beanName + ": this MyInstantiationAwareBeanPostProcessor postProcessProperties");
		return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
	}


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.err.println(beanName + ": this MyInstantiationAwareBeanPostProcessor postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.err.println(beanName + ": this MyInstantiationAwareBeanPostProcessor postProcessAfterInitialization");
		return bean;
	}
}
