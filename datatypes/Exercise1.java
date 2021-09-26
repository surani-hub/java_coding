/*
	Java Data Type: Exercise-1 with Solution
Write a Java program to convert temperature from Fahrenheit to Celsius degree.

The Fahrenheit scale is a temperature scale based on one proposed in 1724 by physicist Daniel Gabriel Fahrenheit. 
It uses the degree Fahrenheit (symbol: °F) as the unit.

The Celsius scale, previously known as the centigrade scale, is a temperature scale used by the 
International System of Units (SI). As an SI derived unit, it is used by all countries in the world, except the U.S.

Test Data
Input a degree in Fahrenheit: 212

*/

import java.util.Scanner;

public class Exercise1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input degree in fahrenheit");
		double fahrenheit  = sc.nextDouble();
		
		double celsius = (5*(fahrenheit-32))/9;
		
		System.out.println("temperature in celsius = " +celsius);
	}
}