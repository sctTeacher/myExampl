package com.shan.sort;

import java.util.Arrays;

public class MaoPaoSort {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 5, 55};
        System.out.println(Arrays.toString(arr));

        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.println("循环第" + j);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        //选择排序
        /*for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/

        System.out.println(Arrays.toString(arr));
    }


}
