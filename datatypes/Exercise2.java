/*
	Java Data Type: Exercise-2 with Solution
Write a Java program that reads a number in inches, converts it to meters.

The inch is a unit of length in the (British) imperial and United States customary systems of measurement 
now formally equal to ​1/36 yard but usually understood as ​1/12 of a foot.

The meter is the base unit of length in some metric systems, including the International System of Units (SI). 
The SI unit symbol is m.

Note: One inch is 0.0254 meter.

Test Data
Input a value for inch: 1000

*/

import java.util.Scanner;

public class Exercise2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("read a number in inches");
		double inch  = sc.nextDouble();
		
		double meter = inch * 0.0254;
		
		System.out.println(inch +" is " +meter);
	}
}