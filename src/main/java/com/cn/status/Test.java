package com.cn.status;


public class Test {
    public static void main(String[] args) {
        VendingMachineBetter machine = new VendingMachineBetter(3);
        machine.insertMoney();
        machine.backMoney();

        System.out.println("----我要中奖----");

        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();

        System.out.println("-------压力测试------");

        machine.insertMoney();
        machine.backMoney();
        machine.backMoney();
        machine.turnCrank();// 无效操作
        machine.turnCrank();// 无效操作
        machine.backMoney();

    }
}
