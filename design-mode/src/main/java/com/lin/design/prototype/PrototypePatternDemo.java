package com.lin.design.prototype;

/**
 * Created by Administrator on 2016/1/13.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape :"+clonedShape.getType());
    }
}
