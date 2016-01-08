package com.lin.design_mode.simple_factory_mode;

/**
 * Created by Administrator on 2016/1/8.
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        try {
            result = get_numberA() / get_numberB();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
