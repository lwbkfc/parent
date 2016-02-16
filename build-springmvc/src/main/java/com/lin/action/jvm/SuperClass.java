package com.lin.action.jvm;

/**
 * Created by Administrator on 2016/2/2.
 */
public class SuperClass {
    /**
     * 被动使用类字段演示一：
     * 通过子类引用父类的静态字段，不会导致子类初始化
     * */

    static {
        System.out.println("SuperClass init!");
    }
    public static int value = 123;
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }

}
class SubClass extends SuperClass{
    static {
        System.out.println("SubClass init!");
    }


}
