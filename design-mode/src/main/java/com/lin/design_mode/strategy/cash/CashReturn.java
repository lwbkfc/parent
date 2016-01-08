package com.lin.design_mode.strategy.cash;

/**
 * Created by Administrator on 2016/1/8.
 */
public class CashReturn implements CashSuper {
    private double moneyCondition;
    private double moneyReturn;
    public CashReturn(double moneyCondition,double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition){
            result = money - (int)(money / moneyCondition) *moneyReturn;
        }
        return result;
    }
}






















