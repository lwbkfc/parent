package com.lin.design_mode.strategy.cash;

/**
 * Created by Administrator on 2016/1/8.
 */
public class CashTest {
    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashAccept("return");
        double totalPrices = 0;
        totalPrices = cashSuper.acceptCash(2000);
        System.out.println(totalPrices);
    }
}
