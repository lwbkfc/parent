package com.lin.design_mode.strategy.cash;

/**
 * Created by Administrator on 2016/1/8.
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
