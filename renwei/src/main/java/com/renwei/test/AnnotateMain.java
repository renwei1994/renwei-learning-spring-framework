package com.renwei.test;

import com.renwei.annotate.InnerClass;
//import com.renwei.annotate.MyConfig;
import com.renwei.annotate.Normal;
import com.renwei.factoryBean.MyFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotateMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("renwei-spring07.xml");
		Object bean = applicationContext.getBean("myFactoryBean");
		Object bean1 = applicationContext.getBean("myFactoryBean");
//		MyConfig bean = applicationContext.getBean(MyConfig.class);
//		Normal normal = bean.getNormal();
//		Normal normal1 = bean.getNormal();
//		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		applicationContext.getBean("com.renwei.annotate.InnerClass$InnerInnerClass")
//		System.out.println(beanDefinitionNames);
//		CustomEditorConfigurer bean = applicationContext.getBean(CustomEditorConfigurer.class);
//		System.out.println(bean.getOrder());
		System.out.println();
	}
}