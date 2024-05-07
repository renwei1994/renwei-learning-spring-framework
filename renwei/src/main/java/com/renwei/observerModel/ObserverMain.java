package com.renwei.observerModel;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.observerModel
 * @Author: renwei
 * @CreateTime: 2024-04-01  10:08
 * @Description: TODO
 * @Version: 1.0
 */
public class ObserverMain {
	public static void main(String[] args)
	{
		RenZiYou renZiYou = new RenZiYou();
		GrandmaObserver grandmaObserver = new GrandmaObserver();
		ChenHanruObserver chenHanruObserver = new ChenHanruObserver();
		RenweiObserver renweiObserver = new RenweiObserver();
		renZiYou.addObserver(grandmaObserver);
		renZiYou.addObserver(chenHanruObserver);
		renZiYou.addObserver(renweiObserver);

		renZiYou.cry();
		renZiYou.hungry();
	}
}
