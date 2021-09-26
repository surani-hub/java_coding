/*
	Java Data Type: Exercise-12 with Solution
Write a Java program to compare two given signed and unsigned numbers.

*/

import java.util.Scanner;

public class Exercise12{
	public static void main(String[] args){
		
		int i1 = Integer.MIN_VALUE;
		int i2 = Integer.MAX_VALUE;
		
		System.out.println(i1);
		System.out.println(i2);
		
		int compare_Signed_num = Integer.compare(i1, i2);
		System.out.println("Result of comparing signed numbers: " + compare_Signed_num);
		
		int compare_Unsigned_num = Integer.compareUnsigned(i1, i2);
        System.out.println("Result of comparing unsigned numbers: " + compare_Unsigned_num);
		
	}
}