package com.renwei.observerModel;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.observerModel
 * @Author: renwei
 * @CreateTime: 2024-04-01  09:59
 * @Description: TODO
 * @Version: 1.0
 */
public class GrandmaObserver implements  Observer{
	@Override
	public void doSomething(String msg) {
		if(msg.equals("hungry")){
			System.out.println("Grandma : eat what");
		}
	}
}
