package com.renwei.test;

import com.renwei.editor.User;
import com.renwei.populateBean.JiaZhou;
import com.renwei.populateBean.School;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class PopulateBeanTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("renwei-spring12.xml");
		JiaZhou bean = applicationContext.getBean(JiaZhou.class);
		Map<String, School> maps = bean.getMaps();
		System.err.printf("121323:----",maps.size());

	}
}
