/*
	Sort the string characters in alphabetical order.
*/

import java.util.Arrays;

public class SortCharacters{
	public static void main(String[] args){
		String str = "java";
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			char temp;
	
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]>ch[j]){
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		
		System.out.println(new String(ch));
		
		String string = "sudha";
		char[] arr = string.toCharArray();
		Arrays.sort(arr);
		System.out.println(new String(arr));
	}
}