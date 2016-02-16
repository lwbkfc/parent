package com.lin.action.jvm;

/**
 * Created by Administrator on 2016/2/1.
 *
 * 打印gc日志需要添加vm options：-XX:+PrintGC  -XX:+PrintGCDetails
 */
public class ReferenceCounting {
    public static void main(String[] args) {
        testGC();
    }

    public Object instance = null;

    private static final int _1MB = 1024*1024;

    private byte[] bigSize = new byte[2*_1MB];

    public static void testGC(){
        ReferenceCounting objA = new ReferenceCounting();
        ReferenceCounting objB = new ReferenceCounting();
        objA.instance = objB;
        objB.instance = objA;

        System.gc();
    }
}
