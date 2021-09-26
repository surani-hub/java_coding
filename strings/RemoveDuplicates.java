/*
	Remove duplicate characters from string.
*/

import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicates{
	public static void main(String[] args){
	String str = "programming";
	
	// Approach-1
	StringBuilder sb = new StringBuilder();
	str.chars().distinct().forEach(c-> sb.append((char)c));
	System.out.println(sb);
	
	// Approach-2
	StringBuilder sb1 = new StringBuilder();
	for(int i=0;i<str.length();i++){
		char ch = str.charAt(i);
		int index = str.indexOf(ch, i+1);
		if(index==-1){
			sb1.append(ch);
		}
	}
	System.out.println(sb1);
	
	
	// Approach-3
	StringBuilder sb2 = new StringBuilder();
	char[] ch = str.toCharArray();
	
	for(int i=0;i<ch.length;i++){
		boolean repeated = false;
		for(int j=i+1;j<ch.length;j++){
			if(ch[i]==ch[j]){
				repeated = true;
				break;
			}
		}
		
		if(!repeated){
			sb2.append(ch[i]);
		}
	}
	System.out.println(sb2);
	
	// Approach-4
	StringBuilder sb3 = new StringBuilder(); 
	 Set<Character> set = new HashSet<>();
	 
	 for(int i=0;i<str.length();i++){
		set.add(str.charAt(i));
	}
	
	for(Character c: set){
		sb3.append(c);
	}
	System.out.println(sb3);
	
	}
}