package com.cn.singleton;

/**
 * 饿汉式
 * 枚举值只有 1 个的时候，其实例也就只有 1 个，就完全符合了单例模式的限定
 * 由于 Java 的 enum 可以跟类一样任意定义方法和属性，所以就完全可以用枚举来实现单例
 */
public enum Singleton5 {
    INSTANCE;

    public void doSomeThing() {

    }
}
