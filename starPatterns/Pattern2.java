/*

	Write a program to print following pattern?
	
	***********
	**********
	*********
	********
	*******
	******
	*****
	****
	***
	**
	*

*/

import java.util.Scanner;

public class Pattern2{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
		for(int i=1;i<=num;i++){
			for(int j=num;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}