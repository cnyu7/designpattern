package com.cn.status;


import lombok.extern.slf4j.Slf4j;

/**
 * 售卖状态
 */
@Slf4j
public class SoldState implements State {


    private VendingMachineBetter machineBetter;

    public SoldState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }

    @Override
    public void insertMoney() {
        log.info("正在出货,请勿投币");
    }

    @Override
    public void backMoney() {
        log.info("正在出货,没有可退的钱");
    }

    @Override
    public void turnCrank() {
        log.info("正在出货,请勿重复摇动手柄");
    }

    @Override
    public void dispense() {
        machineBetter.dispense();
        if (machineBetter.getCount() > 0) {
            machineBetter.setState(machineBetter.getNoMoneyState());
        } else {
            log.info("商品已经售罄");
            machineBetter.setState(machineBetter.getSoldOutState());
        }
    }
}
