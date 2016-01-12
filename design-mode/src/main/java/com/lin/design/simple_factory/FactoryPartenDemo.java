package com.lin.design.simple_factory;

/**
 * Created by lwb on 16/1/12.
 */
public class FactoryPartenDemo {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw();
    }
}
