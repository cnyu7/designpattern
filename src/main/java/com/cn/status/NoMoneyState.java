package com.cn.status;


import lombok.extern.slf4j.Slf4j;

/**
 * 没钱的状态
 */
@Slf4j
public class NoMoneyState implements State {

    private VendingMachineBetter machine;

    public NoMoneyState(VendingMachineBetter machine) {
        this.machine = machine;

    }

    @Override
    public void insertMoney() {
        log.info("投币成功");
        machine.setState(machine.getHasMoneyState());
    }

    @Override
    public void backMoney() {
        log.info("您未投币，想退钱？...");
    }

    @Override
    public void turnCrank() {
        log.info("您未投币，想拿东西么？...");
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态！");
    }

}
