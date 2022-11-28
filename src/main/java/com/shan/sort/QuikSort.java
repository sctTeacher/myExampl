package com.shan.sort;

import java.util.Arrays;

/**
 * 快排
 */
public class QuikSort {


    public static void main(String[] args) {
        int arr[] = {4, 1, 5, 2};
        sort1(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        Arrays a = null;
    }

    //{4,1,5,2}
    public static void sort(int arr[], int L, int R) {
        int i = L;// 最左边索引
        int j = R;// 最右边索引
        int x = arr[(L + R) / 2];// 数组中间的数
        while (i <= j) {
            // 左边小于中间数 i++
            while (arr[i] < x) {
                i++;
            }
            // 右边数大于中间数j--
            while (arr[j] > x) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            // 左边递归
            if (L < j) {
                sort(arr, L, j);
            }
            // 右边递归
            if (i < R) {
                sort(arr, i, R);
            }
        }
    }

    public static void sort1(int[] arr, int L, int R) {
        int i = L;
        int j = R;
        int x = arr[(L + R) / 2];
        while (i <= j) {
            while (arr[i] < x) {
                i++;
            }
            while (arr[j] > x) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (L < j) {
                sort1(arr, L, j);
            }
            if (i < R) {
                sort1(arr, i, R);
            }


        }


    }


}
