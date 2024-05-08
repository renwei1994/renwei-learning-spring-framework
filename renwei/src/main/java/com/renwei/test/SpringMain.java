package com.renwei.test;

import com.renwei.config.context.Rw;
import com.renwei.entity.User;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("renwei-spring10.xml");

//		CustomEditorConfigurer bean = applicationContext.getBean(CustomEditorConfigurer.class);
//		System.out.println(bean.getOrder());
	}
}