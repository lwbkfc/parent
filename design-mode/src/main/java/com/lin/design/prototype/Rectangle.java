package com.lin.design.prototype;

/**
 * Created by Administrator on 2016/1/13.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    @Override
    public Object clone() {
        return super.clone();
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }
}
