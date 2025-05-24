package com.cn.adaptor;

public class Test {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V220Power power = new V220Power();
        mobile.inputPower(new V5PowerAdapter(power));
    }
}
