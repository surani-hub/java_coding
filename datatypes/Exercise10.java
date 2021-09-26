/*
	Java Data Type: Exercise-10 with Solution
Write a Java program to break an integer into a sequence of individual digits.

An integer is a number that can be written without a fractional component. For example, 12, 8, 0, and -2365 are integers, while 4.25, 57 1 / 2, and √3 are not

Test Data
Input six non-negative digits: 123456

*/

import java.util.Scanner;

public class Exercise10{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int num =  number;
		int count = 0;
		
		while(number != 0){
			count++;
			number = number/10;
		}
		
		//System.out.println(count);
		int digit = 0;
		
		while(num != 0){
			count--;
			digit = num / (int )Math.pow(10, count);
			System.out.print(digit +" ");
			num = num % (int)Math.pow(10, count);
		}
		
	}
}