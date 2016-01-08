package com.lin.design_mode.strategy;

/**
 * Created by Administrator on 2016/1/8.
 */
public class Context {
    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
