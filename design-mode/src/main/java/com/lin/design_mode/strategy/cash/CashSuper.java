package com.lin.design_mode.strategy.cash;

/**
 * Created by Administrator on 2016/1/8.
 * 现金收费接口
 */
public interface CashSuper {

    /**
     * @param money 原价
     * @return 当前价
     *
     */
    public double acceptCash(double money);
}
