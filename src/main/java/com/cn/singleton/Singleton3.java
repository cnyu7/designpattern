package com.cn.singleton;

/**
 * 懒汉式
 * DCL
 * 调用getInstance方法完成实例化
 */
public class Singleton3 {
    /**
     * 懒汉式变种，属于懒汉式中最好的写法，保证了：延迟加载和线程安全
     * 需要加volatile
     */
    volatile private static Singleton3 instance = null;

    private Singleton3() {
    }
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                    /*
                    1.分配内存空间
                    2.初始化构造方法
                    3.赋值给引用地址
                     */
                }
            }
        }
        return instance;
    }
}