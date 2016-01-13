package com.lin.design.single.pattern6;

/**
 * Created by Administrator on 2016/1/13.
 */
public enum Single {
    INSTANCE;
    public void showMessage(){
        System.out.println(INSTANCE);
    }
}
