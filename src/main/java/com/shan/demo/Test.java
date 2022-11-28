package com.shan.demo;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        call(a, b);

        System.out.println(a + ":" + b);


        System.out.println(3 & 5);
    }

    private static void call(StringBuffer x, StringBuffer y) {
        // TODO Auto-generated method stub
        System.out.println(x + ":" + y);
        x.append(y);
        System.out.println(x + ":" + y);
        y = x;
        System.out.println(x + ":" + y);
    }

}
