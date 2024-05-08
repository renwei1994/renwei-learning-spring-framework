package com.renwei.observerModel;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.observerModel
 * @Author: renwei
 * @CreateTime: 2024-04-01  09:58
 * @Description: TODO
 * @Version: 1.0
 */
public class RenweiObserver implements Observer {
	@Override
	public void doSomething(String msg) {
		if (msg.equals("cry")) {
			System.out.println("ren wei : no cry");
		}
	}
}
