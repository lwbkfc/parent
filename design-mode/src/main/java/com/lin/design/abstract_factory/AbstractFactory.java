package com.lin.design.abstract_factory;



/**
 * Created by lwb on 16/1/12.
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);

    public abstract Color getColor(String color);

}
