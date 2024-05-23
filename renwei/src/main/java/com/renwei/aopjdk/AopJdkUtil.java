package com.renwei.aopjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AopJdkUtil {
    public static Object createProxy(MyEntity myEntity) {
        ClassLoader classLoader = myEntity.getClass().getClassLoader();
        Class<?>[] interfaces = myEntity.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(myEntity, args);
            }
        };

        Object instance = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return instance;
    }
}
