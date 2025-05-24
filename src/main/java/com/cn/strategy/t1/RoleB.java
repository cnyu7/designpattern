package com.cn.strategy.t1;

public class RoleB extends Role {

    public RoleB(String name) {
        this.name = name;
    }

    @Override
    protected void display() {
        System.out.println("样式2");
    }

    @Override
    protected void run() {
        System.out.println("金蝉脱壳");
    }

    @Override
    protected void attack() {
        System.out.println("九阴真经");
    }

    @Override
    protected void defend() {
        System.out.println("铁布衫");
    }
}
