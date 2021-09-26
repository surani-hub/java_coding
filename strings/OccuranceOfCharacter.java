/*
	Find the occurance of each Character in a string.
	input -> hello
	output -> h=1,e=1,l=2,o=1
*/

import java.util.Map;
import java.util.HashMap;

public class OccuranceOfCharacter{
	public static void main(String[] args){
		//String str = "hello";
		String str = "sudharani";
		
		Map<Character, Integer> map = new HashMap<>();
		
		
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(!map.containsKey(c)){
				map.put(c,1);
			}else{
				map.put(c, map.get(c)+1);
			}
		}
		
		System.out.println(map);
		
	}
}