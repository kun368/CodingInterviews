package com.zzkun.T2;

public class Singleton1 {
 
    // 静态的成员式内部类，只有被调用到时才会加载
    private static class SingletonHolder {
        private static Singleton1 instance = new Singleton1();
    }
 
    // 私有化构造方法
    private Singleton1() {
        System.out.println("Singleton1.Singleton1");
    }
 
    public static Singleton1 getInstance() {
        return SingletonHolder.instance;
    }
}