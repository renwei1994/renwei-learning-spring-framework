package com.renwei.aopjdk;

public class MyEntity implements MyInterfac1, MyInterfac2 {
    @Override
    public void fun1(int var) {
        System.out.println("fun1");
    }

    @Override
    public void fun2(int var1, String var2) {
        System.out.println("fun2");
    }

    @Override
    public void fun3(int var1, String var2, Boolean var3) {
        System.out.println("fun3");
    }

    @Override
    public void fun4(int var1, String var2, Boolean var3, Float var4) {
        System.out.println("fun4");
    }
}
