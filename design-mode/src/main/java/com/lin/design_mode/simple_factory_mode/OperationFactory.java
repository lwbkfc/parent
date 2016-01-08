package com.lin.design_mode.simple_factory_mode;

/**
 * Created by Administrator on 2016/1/8.
 */
public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation oper = null;
        switch (operate){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}
