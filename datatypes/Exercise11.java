/*
	Java Data Type: Exercise-11 with Solution
Write a Java program to test whether a given double/float value is a finite floating-point value or not.

*/

import java.util.Scanner;

public class Exercise11{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		
		boolean ans = Double.isFinite(number);
		System.out.println(ans +" ");
		
		System.out.println(Double.isFinite(number/0.0));
		
		System.out.println(Double.isFinite(0.0/0.0));
			
	}
}