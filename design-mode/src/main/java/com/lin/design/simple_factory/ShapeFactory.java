package com.lin.design.simple_factory;

/**
 * Created by lwb on 16/pattern1/12.
 */
public class ShapeFactory {
    public static Shape getShape(String shapeType){

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
}
