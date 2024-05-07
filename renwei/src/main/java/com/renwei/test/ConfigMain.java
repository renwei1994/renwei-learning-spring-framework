package com.renwei.test;

//import com.renwei.annotate.MyConfig;
import com.renwei.config.config.MyConfigTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("renwei-spring09.xml");
		MyConfigTest myConfigTest = applicationContext.getBean(MyConfigTest.class);
		Object a = applicationContext.getBean("a");
		Object b = applicationContext.getBean("b");
		System.out.println();
	}
}