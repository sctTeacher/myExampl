package com.shan.demo;

import java.io.UnsupportedEncodingException;

/**
 * 翻转
 *
 * @author sc
 */
public class Test2 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // TODO Auto-generated method stub
        String str = "abc";
        //String change = change(str);
        //System.out.println(change);


        String reverse = reverse(str);
        System.out.println(reverse);
    }

    //递归字符串翻转 递归
    public static String change(String str) {
        if (null == str || str.length() <= 1) {
            return str;
        }
        System.out.println(str.substring(1) + str.charAt(0));
        // abc  bc c  cba
        return change(str.substring(1)) + str.charAt(0);

    }

    //递归字符串翻转 递归
    public static String reverse(String str) {


        if (null == str || str.length() <= 1) {
            return str;
        }
        char[] array = str.toCharArray();
        int right = array.length - 1;
        for (int i = 0; i < right; i++) {
            char temp = array[i];
            array[i] = array[right];
            array[right] = temp;
            right--;
        }
        return new String(array);

    }

}
