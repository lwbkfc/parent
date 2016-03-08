package com.lin.test;

/**
 * Created by lwb on 16/pattern1/11.
 */
public class Driver implements IDriver {
    public void drive(ICar iCar) {
        iCar.run();
    }
}
