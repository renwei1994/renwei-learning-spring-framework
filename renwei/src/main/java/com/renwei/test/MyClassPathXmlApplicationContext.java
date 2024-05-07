package com.renwei.test;

import com.renwei.beanFatoryPostProcessor.CustomBeanFactoryPostProcessor;
import com.renwei.beanFatoryPostProcessor.MyBeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.test
 * @Author: renwei
 * @CreateTime: 2024-01-09  14:59
 * @Description: TODO
 * @Version: 1.0
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
	public MyClassPathXmlApplicationContext() {
		super();
	}

	public MyClassPathXmlApplicationContext(String... configLocations) {
		super(configLocations);
	}
	@Override
	protected void initPropertySources() {
		System.out.println("this is my MyClassPathXmlApplicationContext");
		// ，
		getEnvironment().setRequiredProperties("username");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
//		beanFactory.setAllowBeanDefinitionOverriding(false);
//		beanFactory.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}


}
