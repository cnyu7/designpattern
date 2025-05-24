package com.cn.strategy.t2;

public class Test {

    public static void main(String[] args) {
        Role role = new RoleA("萧炎");
        role.setAttackBehavior(new AttackJY())
                .setDefendBehavior(new DefendTBS())
                .setDisplayBehavior(new DisplayDa());

        System.out.println(role.name);
        role.attack();
        role.defend();
        role.display();
    }
}
