package com.shan.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 返回字符串中出现最多的一个字符
 * 
 * @author sc
 *
 */
public class Test4 {

	public static void main(String[] args) {
		String str = "abcaaabc";
		HashMap<Character, Integer> map = new HashMap<>();
		char[] arr = str.toCharArray();
		for (char key : arr) {
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
		String max = getMax(map);
		System.out.println(max);
	}

	public static String getMax(HashMap<Character, Integer> map){
		
		if(null!=map&&map.size()>0){
			 Set<Character> set = map.keySet();
			 Iterator iterator = set.iterator();
			 Character maxKey = (Character) iterator.next();
			 Integer maxV = map.get(maxKey);
			 while(iterator.hasNext()){
				 Character key = (Character) iterator.next();
				 Integer value = map.get(key);
				 if(value>maxV){
					 maxKey=key;
					 maxV=value;
				 }
			 }
			 System.out.println("出现次数最多为:"+maxKey+"="+maxV);
				return maxKey+"="+maxV;
		}
		return null;
		
	}
	
	
}
