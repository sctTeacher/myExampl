package com.shan.sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author sc
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {4, 2, 3};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));

    }


    public static int[] sort(int[] arr) {// 2 4  3
        for (int i = 1; i < arr.length; i++) {
            //要插入到值
            int insertVal = arr[i];
            //前一个索引
            int index = i - 1;
            //比较要插入的值是否小于前一个  是的话 前一个后移
            while (index >= 0 && insertVal < arr[index]) {
                arr[index + 1] = arr[index];
                index--;
            }
            //插入要插入的值
            arr[index + 1] = insertVal;
        }
        return arr;
    }


}
