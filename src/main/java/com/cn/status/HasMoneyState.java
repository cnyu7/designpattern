package com.cn.status;


import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * Created by jingbin on 2016/11/2.
 * 已投入钱的状态
 */

@Slf4j
public class HasMoneyState implements State {

    private VendingMachineBetter machineBetter;
    Random random = new Random();

    public HasMoneyState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }

    @Override
    public void insertMoney() {
        log.info("您已经投过币了,不用再投了");
    }

    @Override
    public void backMoney() {
        log.info("退币成功");
        machineBetter.setState(machineBetter.getNoMoneyState());
    }

    @Override
    public void turnCrank() {
        log.info("你转动了手柄...");
        int winner = random.nextInt(10);
        if (winner == 0 && machineBetter.getCount() > 1) {
            machineBetter.setState(machineBetter.getWinnerState());
        } else {
            machineBetter.setState(machineBetter.getSoldState());
        }

    }

    @Override
    public void dispense() {
        log.info("只有在 售出商品状态时才能出货!");
        throw new IllegalStateException("非法状态!");
    }
}
