package com.cn.observer.java;

import java.util.Observable;

/**
 * 双色球的服务号主题
 */
public class SubjectForSSQ extends Observable {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
