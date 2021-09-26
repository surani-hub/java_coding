/*
	Write a programme to print the following number pattern.
	1
	2 1
	3 2 1 
	4 3 2 1 
	5 4 3 2 1 
	
*/

import java.util.Scanner;

public class NumberPattern4{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int i=1;i<number;i++){
			int k = i;
			for(int j=1;j<=i;j++){
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
		
		
	}
}