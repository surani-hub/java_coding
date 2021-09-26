/*
	Java Data Type: Exercise-6 with Solution
Write a Java program to compute body mass index (BMI).

BMI: The BMI is defined as the body mass divided by the square of the body height, and is universally expressed 
in units of kg/m2, resulting from mass in kilograms and height in metres.

Test Data
Input weight in pounds: 452
Input height in inches: 72

*/

import java.util.Scanner;

public class Exercise6{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double weightInPounds = sc.nextDouble();
		double heightInInches = sc.nextDouble();
		
	/* BMI = weight(kg)/[height(m)*height(m)]*/
		
		double BMI = (weightInPounds * 0.453592) / (heightInInches * 0.0254 * heightInInches * 0.0254);
		
		System.out.println("Body Mass Index is " + BMI);


	}
}