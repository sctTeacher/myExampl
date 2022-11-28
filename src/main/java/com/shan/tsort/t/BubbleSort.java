package com.shan.tsort.t;

import java.util.Arrays;

/**
 * @author ShanCong
 * @date 2018/10/24 8:42
 * @description:
 */
public class BubbleSort {
    public static void main(String[] args) {
        Person_ p1 = new Person_(12);
        Person_ p2 = new Person_(1);
        Person_ p3 = new Person_(112);
        Person_ p4 = new Person_(42);
        Person_ p5 = new Person_(15);
        Person_ p[] = {p1, p2, p3, p4, p5};

        System.out.println("排序之前");
        System.out.println(Arrays.toString(p));
        System.out.println("排序之后");
        selectSort(p);
        System.out.println(Arrays.toString(p));
    }

    /**
     * 冒泡
     *
     * @param x
     * @param <T>
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] x) {
        T temp;
        int size = x.length;
        for (int i = 0; i < size - 1; i++) {

            for (int j = 0; j < size - i - 1; j++) {
                if (x[j].compareTo(x[j + 1]) > 0) {
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;

                }
            }

        }

    }

    /**
     * 选择
     *
     * @param x
     * @param <T>
     */
    public static <T extends Comparable<T>> void selectSort(T[] x) {
        T temp;
        int size = x.length;
        int k = 0;
        for (int i = 0; i < size - 1; ++i) {
            k = i;
            for (int j = i + 1; j < size; ++j) {
                if (x[k].compareTo(x[j]) > 0)
                    k = j;
            }
            if (k != i) {
                temp = x[k];
                x[k] = x[i];
                x[i] = temp;
            }
        }
    }
}
