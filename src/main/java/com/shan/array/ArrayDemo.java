package com.shan.array;

/**
 * 稀疏数组
 *  当一个数组中 大部分元素为0，或者为同一值的数组时，可以使用稀疏数组来保存该数组
 *  稀疏数组处理方式
 *    1.1记录数组 有几行几列 有多少不同值
 *    1.2 把具有不同值的元素的行 列 值 记录在一个小规模数组中，从而缩小程序的规模
 *    例如  左边 为原始数组   右边为稀疏数组

 模拟五子棋  1代表白棋   2代表黑棋
 ---------原数组---------
 0	1	0	0	0	0	0	0	0	0	0
 0	0	2	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0



 ---------稀疏数组---------
 第一列
 行 列  值
 11	11	2	 （原数组总行 原数组总列  有多少不同值）
 0	1	1    （原数组第一个不同值的行 原数组第一个不同值的列  值）
 1	2	2


 ---------压缩数组还原---------
 0	1	0	0	0	0	0	0	0	0	0
 0	0	2	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0
 0	0	0	0	0	0	0	0	0	0	0




 *
 *
 *
 *
 *
 *
 */
public class ArrayDemo {

    public static void main(String[] args) {
        System.out.println("---------原数组---------");
        // 原数据
        int [] [] arr1=new int[11][11];
        arr1[0][1] =1;
        arr1[1][2] =2;
        //统计有效数字 非0
       int sum=0;
        for (int i=0;i<arr1.length;i++){
            for (int j=0 ;j<arr1[i].length ;j++){
                if(arr1[i][j] !=0){
                    sum++;
                }
                System.out.print(arr1[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("原数组有效数字"+sum);
        // 数据压缩  定义
        int [] [] arr2=new int[sum+1][3];
        arr2[0][0]=11;
        arr2[0][1]=11;
        arr2[0][2]=sum;
        // 数据压缩  赋值
        int count=0;
        for (int i=0;i<arr1.length;i++){
            for (int j=0 ;j<arr1[i].length ;j++){
                if(arr1[i][j] !=0){
                    count++;
                    arr2[count][0]=i;
                    arr2[count][1]=j;
                    arr2[count][2]=arr1[i][j];
                }
            }
        }
        System.out.println("---------压缩数组---------");
        //打印压缩 数据
        for (int i=0;i<arr2.length;i++){
            for (int j=0 ;j<arr2[i].length ;j++){
                System.out.print(arr2[i][j] +"\t");
            }
            System.out.println();
        }
        //压缩数组还原   定义
        int [] [] arr3=new int[arr2[0][0]][arr2[0][1]];
        //压缩数组还原   赋值
        for (int i=1;i<arr2.length;i++){
            for (int j=0 ;j<arr2[i].length ;j++){
                arr3[arr2[i][0]][arr2[i][1]]=arr2[i][j];
            }
        }
        System.out.println("---------压缩数组还原---------");
        //打印压缩 压缩数组还原
        for (int i=0;i<arr3.length;i++){
            for (int j=0 ;j<arr3[i].length ;j++){
                System.out.print(arr3[i][j] +"\t");
            }
            System.out.println();
        }


    }



}
