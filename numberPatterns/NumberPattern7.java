/*
	Write a programme to print the following number pattern.
	1
	2 6
	3 7 10
	4 8 11 13
	5 9 12 14 15
	
*/

import java.util.Scanner;

public class NumberPattern7{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int i=1;i<=number;i++){
			int num = i;
			for(int j=1;j<=i;j++){
				System.out.print(num+" " );
				num = num+number-j;
			}
			System.out.println();
		}	
	}
}