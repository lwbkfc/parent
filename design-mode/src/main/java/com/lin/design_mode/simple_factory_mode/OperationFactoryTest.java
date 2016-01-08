package com.lin.design_mode.simple_factory_mode;

/**
 * Created by Administrator on 2016/1/8.
 */
public class OperationFactoryTest {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperate("+");
        operation.set_numberA(9.3);
        operation.set_numberB(2.3);
        double result = operation.getResult();
        System.out.println(result);
    }
}
