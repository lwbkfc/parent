package com.lin.test;

/**
 * Created by lwb on 16/1/11.
 */
public class Client {
    public static void main(String[] args) {
        IDriver driver = new Driver();
        ICar car = new Benz();
        driver.drive(car);
    }
}
