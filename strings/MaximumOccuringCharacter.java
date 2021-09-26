/*
	Write a programme to find the maximum occuring character in string.
*/

// two ways

import java.util.Scanner;

public class MaximumOccuringCharacter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int[] arr = new int[256];
		
		for(int i=0;i<str.length();i++){
			//arr[str.charAt(i)] = arr[str.charAt(i)] + 1; 
			arr[str.charAt(i)]++;
		}
		
		int max = 0;
		char ch = ' ';
		
		for(int i=0;i<str.length();i++){
			if(max<arr[str.charAt(i)]){
				max = arr[str.charAt(i)];
				ch = str.charAt(i);
			}
		}
		
		System.out.println("maximum occuring character is "+ ch);
	}
}