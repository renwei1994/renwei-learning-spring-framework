package com.renwei.annotate;

import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.annotate
 * @Author: renwei
 * @CreateTime: 2024-03-20  15:47
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class InnerClass extends MyInnerClass implements MyInnerInterface{
	@Component
	class InnerInnerClass {
		private String name = "renwei";

		@Component
		private class InnerInnerInnerClass {

		}
		public void test() {
			System.out.println("InnerClass.test()");
		}
	}
}
