/*
	Find first non-repeated character in a string.
	input -> aabbcdefbd
	output -> c
*/

import java.util.Map;
import java.util.HashMap;

public class NonRepeatedCharacter{
	public static void main(String[] args){
		//String str = "aabbcdefbd";
		String str = "level";
		
		// Approach-1
		for(int i=0;i<str.length();i++){
			boolean unique = true;
			
			for(int j=0;j<str.length();j++){
				if(i!=j && str.charAt(i)==str.charAt(j)){
					unique = false;
					break;
				}
			}
			
			if(unique){
				System.out.println(str.charAt(i));
				break;
			}
		}
		
		// Approach-2
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);	
			}else{
				map.put(ch,1);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entryset : map.entrySet()){
			if(entryset.getValue()==1){
				System.out.println(entryset.getKey());
				break;
			}
		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
}