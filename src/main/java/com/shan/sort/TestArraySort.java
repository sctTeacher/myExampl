package com.shan.sort;

import java.util.Arrays;

/**
 * 对任意对象排序
 * 
 * @author sc
 *
 */
public class TestArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Java", 45);
		Student s2 = new Student("C", 80);
		Student s3 = new Student("Python", 60);
		Student s4 = new Student("12345", 18);
		Student p[] = {s1, s2, s3, s4 }; System.out.println("排序前");
		System.out.println(Arrays.toString(p)); maoSort(p);
		System.out.println("排序后"); System.out.println(Arrays.toString(p));

	}

	/**
	 * 冒泡排序数组
	 */
	public static <T extends Comparable<T>> void maoSort(T[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}


}
