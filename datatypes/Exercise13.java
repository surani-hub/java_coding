/*
	Java Data Type: Exercise-13 with Solution
Write a Java program to compute the floor division and the floor modulus of the given dividend and divisor.

*/

import java.util.Scanner;

public class Exercise13{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println("Floor division is " + Math.floorDiv(num1, num2) );
		
		System.out.println();
		
        System.out.println("Floor modulus is " + Math.floorMod(num1, num2) );
		
	}
}