package com.shan.mianshi;

public class Demo2 {

	public static void main(String[] args) {
		int a=1289;
		Integer b=new Integer(1289);
		System.out.println(a==b);//会先把b自动拆箱 在比较 true
		System.out.println(b.equals(a));//true
		
		System.out.println("----------------");
		String str = "1234";
		for (int i = str.length(); i > 0; i--) {
			for (int j = 0; j + i <= str.length(); j++) {
				String s = str.substring(j, i + j);
				System.out.println(s);
			}
		}
		System.out.println("------------");
		Integer c=123;
		b(c);
		System.out.println(c);
		double d=3.14*100;
		double dd=0.1*100;
		double ddd=(d*dd)/100;
		System.out.println(ddd);
		
	}
	
	public static void b(Integer a){
		a++;
	}

}
