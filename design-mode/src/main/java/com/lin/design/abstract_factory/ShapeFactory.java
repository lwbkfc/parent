package com.lin.design.abstract_factory;

/**
 * Created by lwb on 16/1/12.
 */
public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shapeType){

        if (shapeType == null){
            return null;

        }
        if (shapeType.equalsIgnoreCase("square")){
            return new Square();
        }else if (shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;

    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
