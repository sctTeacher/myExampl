package com.shan.mianshi;

public class Demo4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //（小数点后第一位）大于五全部加，等于五正数加，小于五全不加。
        System.out.println(Math.round(11.46));
        System.out.println(Math.round(-11.46));
        System.out.println(Math.round(11.68));
        System.out.println(Math.round(-11.68));
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));
        //Math.ceil() 向上取证整
        /**
         *  Math.ceil(11.46)=Math.ceil(11.68)=Math.ceil(11.5)=12
         Math.ceil(-11.46)=Math.ceil(-11.68)=Math.ceil(-11.5)=-11
         */
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        /**
         * .Math.floor()向下取整
         *
         Math.floor(11.46)=Math.floor(11.68)=Math.floor(11.5)=11
         Math.floor(-11.46)=Math.floor(-11.68)=Math.floor(-11.5)=-12

         */
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

}
