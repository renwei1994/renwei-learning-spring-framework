package com.renwei.observerModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.observerModel
 * @Author: renwei
 * @CreateTime: 2024-04-01  09:56
 * @Description: TODO
 * @Version: 1.0
 */
public class RenZiYou implements Girl {
	private List<Observer> observerList = new ArrayList<>();

	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}

	public void notifyObserver(String msg) {
		for (Observer observer : observerList) {
			observer.doSomething(msg);
		}
	}

	@Override
	public void cry() {
		notifyObserver("cry");
	}

	@Override
	public void hungry() {
		notifyObserver("hungry");
	}
}
