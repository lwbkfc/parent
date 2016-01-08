package com.lin.design_mode.strategy.cash;

/**
 * Created by Administrator on 2016/1/8.
 */
public class CashContext {
    private CashSuper cs;

    public CashContext(CashSuper cashSuper){
        this.cs = cashSuper;
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
