/*
	Java Data Type: Exercise-3 with Solution
Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

An integer is a number that can be written without a fractional component. 
For example, 23, 6, 0, and −1245 are integers, while 3.25, ​7 and 1/2, and √3 are not.

Test Data
Input an integer between 0 and 1000: 565
*/

import java.util.Scanner;

public class Exercise3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("read a number");
		int num  = sc.nextInt();
		int sum=0,rem;
		
		while(num != 0){
			rem = num %10;
			num = num/10;
			sum = sum+rem;
		}
		
		System.out.println("sum of digits = " + sum);	
	}
}