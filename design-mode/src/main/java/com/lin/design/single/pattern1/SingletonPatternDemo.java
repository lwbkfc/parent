package com.lin.design.single.pattern1;

import com.lin.design.single.pattern1.SingleObject;

/**
 * Created by Administrator on 2016/pattern1/13.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
        SingleObject object1 = SingleObject.getInstance();
        object1.showMessage();
    }
}
