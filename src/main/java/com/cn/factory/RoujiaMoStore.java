package com.cn.factory;

public class RoujiaMoStore {


    private SimpleRouJiaMoFactory factory;

    public RoujiaMoStore(SimpleRouJiaMoFactory factory) {
        this.factory = factory;
    }

    /**
     * 根据传入类型卖不同的肉夹馍
     *
     * @param type
     * @return
     */
    public RouJiaMo sellRouJiaMo(String type) {

        RouJiaMo rouJiaMo = factory.createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }

}
