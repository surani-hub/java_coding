/*
	Write java program to check whether string is a palindrome or not?
	
*/

import java.util.Scanner;

public class PalindromeString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--){
			rev = rev + str.charAt(i);
		}
		
		System.out.println(str);
		System.out.println(rev);
		
		if(str.equals(rev)){
			System.out.println("Palindrome String");
		}else{
			System.out.println("Not a Palindrome String");
		}
	}
}