package com.cn.status;


import lombok.extern.slf4j.Slf4j;

/**
 * 售罄的状态
 */

@Slf4j
public class SoldOutState implements State {

    private VendingMachineBetter machineBetter;

    public SoldOutState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }

    @Override
    public void insertMoney() {
        log.info("投币失败,商品已售罄...");
    }

    @Override
    public void backMoney() {
        log.info("您未投币,想退钱么?");
    }

    @Override
    public void turnCrank() {
        log.info("商品售罄，转动手柄也木有用...");
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态!");
    }
}
