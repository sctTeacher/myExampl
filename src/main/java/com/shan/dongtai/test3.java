package com.shan.dongtai;

import java.util.Arrays;

public class test3 {

public static void main(String[] args) {
	int [] arr= {4 ,3, 1, 6,8};
	 int[] aarr2 = stord(arr);
	 System.out.println(Arrays.toString(aarr2));
	 int i = serach(aarr2, 8);
	 System.out.println(i);
	 
	 
	 
}
/**
 * 冒泡
 * @param array
 * @return
 */
//4 ,3,1, 6
	public static int[] stord(int[] array){
		for(int i=0;i<array.length-1;i++){//3
			for(int j=0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){//4 ,3,1, 6  3 1 4 6  1 3 4 6
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}
	/**
	 * 
	 * @param array
	 * @return
	 */
	//4 ,3,1, 6
	public static int[] stord1(int[] array){
		for(int i=0;i<array.length-1;i++){//3
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){  
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
		
	}
	// 1 3 4 6 8  
	public static int serach(int [] arr,int num){
		int  sIneds = 0;
		int endI =arr.length-1;
		int model=0;
		while(sIneds<=endI){
			model=sIneds+((endI-sIneds)>>1);
			if(num>arr[model]){
				sIneds=model+1;
			}else if(num < arr[model]){
				endI=model-1;
			}else{
				return model;
			}
		}
		return -1;
	}
	
}
