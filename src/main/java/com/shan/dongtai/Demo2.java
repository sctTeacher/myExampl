package com.shan.dongtai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Demo2 {
	
	
	public static void main(String[] args) {
		ArrayList<Student> arr=new ArrayList<>();
		Map<String, String> map = new HashMap<String,String>();
		//给map中添加元素
		map.put("邓超", "孙俪");
		map.put("李晨", "范冰冰");
		map.put("刘德华", "柳岩");
		//获取Map中的所有key
		Set<String> keySet = map.keySet();
		String a="a";
		String b="a";
		System.out.println(a==b);
		
		
	}
}
