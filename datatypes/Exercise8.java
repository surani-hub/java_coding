/*
	Java Data Type: Exercise-8 with Solution
Write a Java program that reads a number and display the square, cube, and fourth power.

Test Data
Input the side length value: 15

*/

import java.util.Scanner;

public class Exercise8{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		System.out.println("square " + length*length);
		System.out.println("cube " + length*length*length);
		System.out.println("fourth " + length*length*length*length);
		
		//Math.pow(length, 4);
		
		sc.close();
		
	}
}