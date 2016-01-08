package com.lin.design_mode.strategy;

/**
 * Created by Administrator on 2016/1/8.
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();
    }
}
