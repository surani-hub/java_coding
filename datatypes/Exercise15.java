/*
	Java Data Type: Exercise-15 with Solution
Write a Java program to get the next floating-point adjacent in the direction of positive and 
negative infinity from a given float/double number.

*/

import java.util.Scanner;

public class Exercise15{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		float floatNum = sc.nextFloat();
		
		System.out.println("Double number");
		System.out.println("next adjacent in positive is " + Math.nextUp(number));
		System.out.println("next adjacent in negative is " + Math.nextDown(number));
		
		System.out.println();
		
		System.out.println("float number");
		System.out.println("next adjacent in positive is " + Math.nextUp(floatNum));
		System.out.println("next adjacent in negative is " + Math.nextDown(floatNum));
		
	}
}