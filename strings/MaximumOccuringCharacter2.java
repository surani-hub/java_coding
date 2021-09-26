/*
	Write a programme to find the maximum occuring character in string.
*/

// two ways

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MaximumOccuringCharacter2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		char[] ch = str.toCharArray();
		
		for(char c:ch){
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}else{
				hm.put(c,1);
			}
		}
		
		int maxCount = 0;
		char maxCh = ' ';
		
		for(Map.Entry<Character, Integer> me: hm.entrySet()){
			if(maxCount < me.getValue()){
				maxCount = me.getValue();
				maxCh = me.getKey();
			}
		}
		
		System.out.println("maximum occuring character is "+ maxCh);
	}
}