package com.lin.design.single.pattern1;

/**
 * Created by Administrator on 2016/pattern1/13.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println(instance);
    }
}
