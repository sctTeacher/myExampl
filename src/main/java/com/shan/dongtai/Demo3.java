package com.shan.dongtai;

public class Demo3 {

	public static void main(String[] args) {
		String str = "1234";
		for (int i = str.length(); i > 0; i--) {
			for (int j = 0; j + i <= str.length(); j++) {
				String s = str.substring(j, i + j);
				System.out.println(s);
			}
		}

	}

}
