package com.lin.design_mode.strategy.cash;

/**
 * Created by Administrator on 2016/1/8.
 */
public class CashRebate implements CashSuper {
    private double moneyRebate = 1d;
    public CashRebate(double moneyRebate){
        this.moneyRebate = moneyRebate;
    }
    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
