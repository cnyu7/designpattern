package com.cn.strategy.t1;

public class RoleC extends Role {

    public RoleC(String name) {
        this.name = name;
    }

    @Override
    protected void display() {
        System.out.println("样式3");
    }

    @Override
    protected void run() {
        System.out.println("金蝉脱壳");
    }

    @Override
    protected void attack() {
        System.out.println("华阳针法");
    }

    @Override
    protected void defend() {
        System.out.println("龙凰古甲");
    }
}
