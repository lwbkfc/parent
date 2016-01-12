package com.lin.design.abstract_factory;

/**
 * Created by lwb on 16/1/12.
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    public Color getColor(String color){
        if (color == null){
            return null;
        }
        if (color.equalsIgnoreCase("red")){
            return new Red();
        }else if (color.equalsIgnoreCase("blue")){
            return new Blue();
        }else if (color.equalsIgnoreCase("green")){
            return new Green();
        }
        return null;
    }
}
