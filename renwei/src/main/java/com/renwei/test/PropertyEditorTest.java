package com.renwei.test;

import com.renwei.editor.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.test
 * @Author: renwei
 * @CreateTime: 2024-04-18  15:16
 * @Description: TODO
 * @Version: 1.0
 */
public class PropertyEditorTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("renwei-spring15.xml");
		User bean = applicationContext.getBean(User.class);
		System.out.println(bean.getAddress().toString());
	}
}
