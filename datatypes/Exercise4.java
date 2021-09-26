/*
	Java Data Type: Exercise-4 with Solution
Write a Java program to convert minutes into a number of years and days.

Test Data
Input the number of minutes: 3456789

*/

import java.util.Scanner;

public class Exercise4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long mins = sc.nextLong();
		
		long in_years = mins / (365 * 24 * 60);
		
		long in_days = (mins%525600) / (24 * 60);
		
		System.out.println("number of years : "+ in_years + " and number of days : "+ in_days);
	}
}