package com.cn.single;

/**
 * 懒汉式
 * 静态内部类
 * 调用getInstance方法完成实例化
 */
public class Singleton4 {

    private Singleton4() {}

    private static class  SingletonHolder{
        private static Singleton4 instance = new Singleton4();
    }
    public static Singleton4 getInstance(){
        return SingletonHolder.instance;
    }
}
