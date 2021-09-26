/*
	Longest substring without repeated character
	input -> java
	output -> jav
*/

import java.util.Map;
import java.util.HashMap;

public class LongestSubstring{
	public static void main(String[] args){
		//String string = "java";
		//String string = "abacbdef";
		//String string = "abcabcbb";
		//String string = "bbbbb";
		String string = "pwwkew";
		longestSubstring(string);
	}
	
	
	public static void longestSubstring(String str){
	int longestLen =0;
	String longestStr ="";
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++){
		char ch = str.charAt(i);
			if(!map.containsKey(ch)){
				map.put(ch,i);
			}else{
				//i = map.get(ch);
				map.clear();
			}
			
			if(map.size()>longestLen){
				longestLen = map.size();
				longestStr = map.keySet().toString();
			}
		}
		
		System.out.println(map);
		System.out.println(longestStr);
		System.out.println(longestLen);
	}
}