/*

	Write a programme to print the following number pattern.
1
2 3
4 5 6
7 8 9 10

*/

import java.util.Scanner;

public class NumberPattern3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int k=1;
		for(int i=1;i<number;i++){
			for(int j=1;j<=i;j++){
				System.out.print(k+" ");
				k = k+1;
			}
			System.out.println();
		}
	}
}