package com.shan.mianshi;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
/**
 *返回出现一次的第一个字符串
 * @author sc
 *
 */
public class Demo {

	public static void main(String[] args) {
		String str="abbc";
			gerD(str);
	}
	
	public static void gerD(String str){
	char[] cs = str.toCharArray();
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		for (int i = 0; i < cs.length; i++) {
			if(map.containsKey(cs[i])){
				map.put(cs[i], map.get(cs[i])+1);
			}else{
				map.put(cs[i], 1);
			}
		}
		Set<Entry<Character,Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			Integer value = entry.getValue();
			if(1==value){
				Character	key= entry.getKey();
				System.out.println(key);
				return ;
			}
			
		}
	}
}
