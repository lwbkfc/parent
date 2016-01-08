package com.lin.design_mode.simple_factory_mode;

/**
 * Created by Administrator on 2016/1/8.
 */
public class Operation {
    private double _numberA;
    private double _numberB;

    public double get_numberA() {
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    public double get_numberB() {
        return _numberB;
    }

    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }
    public double getResult(){
        return 0;
    }
}
