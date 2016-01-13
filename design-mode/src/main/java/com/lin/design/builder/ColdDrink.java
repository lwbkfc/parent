package com.lin.design.builder;

/**
 * Created by Administrator on 2016/1/13.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
