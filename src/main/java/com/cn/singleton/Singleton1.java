package com.cn.singleton;

/**
 * 饿汉式
 * 静态属性
 * 在Singleton类被装载完成了实例化
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private Singleton1() {}
    public Singleton1 getInstance(){
        return instance;
    }
}
