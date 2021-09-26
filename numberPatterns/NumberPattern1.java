/*

	Write a programme to print the following number pattern.
1
22
333
4444
55555

*/

import java.util.Scanner;

public class NumberPattern1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int i=1;i<number;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}