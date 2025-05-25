package com.cn.status;


/**
 * 状态的接口
 */
public interface State {
    /**
     * 放钱
     */
    void insertMoney();

    /**
     * 退钱
     */
    void backMoney();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 出商品
     */
    void dispense();
}
