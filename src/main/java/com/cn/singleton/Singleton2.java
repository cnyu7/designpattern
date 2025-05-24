package com.cn.singleton;

/**
 * 饿汉式
 * 静态代码块
 * 在Singleton类被装载完成了实例化
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2() {}
    static {
        instance = new Singleton2();
    }
    public Singleton2 getInstance(){
        return instance;
    }
}
