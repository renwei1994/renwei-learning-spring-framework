package com.renwei.aopjdk;

public class AopJdkTest {
    public static void main(String[] args) {
		// 加上这个 class文件就会在本地显示  不加上的话  就会缓存在内存中
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        MyEntity proxy = (MyEntity) AopJdkUtil.createProxy(new MyEntity());
        proxy.fun1(1);
        System.out.println("12");
    }
}
