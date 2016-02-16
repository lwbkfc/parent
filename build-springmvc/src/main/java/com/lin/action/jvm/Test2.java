package com.lin.action.jvm;

/**
 * Created by Administrator on 2016/2/1.
 */
public class Test2 {
    private int a = 3;
    private String str = "hello world";

    public static void main(String[] args) {
        for (;;){
            Test2 test2 = new Test2();
            System.out.println(test2.a+test2.str);
        }

    }
}
