/*
	Write a programme to print the following number pattern.
	
1
12
123
1234
12345

*/

import java.util.Scanner;

public class NumberPattern2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int i=1;i<number;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}