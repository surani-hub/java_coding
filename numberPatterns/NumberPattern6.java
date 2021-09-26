/*
	Write a programme to print the following number pattern.
	5 4 3 2 1 
	5 4 3 2
	5 4 3 
	5 4 
	5 
	
*/

import java.util.Scanner;

public class NumberPattern6{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int i=1;i<=number;i++){
			
			for(int j=number;j>=i;j--){
				System.out.print(j+" " );
			}
			System.out.println();
		}	
	}
}