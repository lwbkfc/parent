package com.lin.design_mode.simple_factory_mode;

/**
 * Created by Administrator on 2016/1/8.
 */
public class OperationAdd extends Operation{
    @Override
    public double getResult() {
        double result = 0;
        result = get_numberA()+get_numberB();
        return result;
    }
}
