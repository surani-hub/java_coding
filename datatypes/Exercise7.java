/*
	Java Data Type: Exercise-7 with Solution
Write a Java program to display the speed, in meters per second, kilometers per hour and miles per hour.
User Input : Distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds).
Note : 1 mile = 1609 meters

Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23

*/

import java.util.Scanner;

public class Exercise7{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double distanceInMeters = sc.nextDouble();
		double hour = sc.nextDouble();
		double minutes = sc.nextDouble();
		double seconds = sc.nextDouble();
		
		double totalTimeInSeconds = (hour * 60 * 60) + (minutes * 60) + seconds;
		double totalTimeInHours = totalTimeInSeconds / 3600;
		
		System.out.println("totalTimeInSeconds " + totalTimeInSeconds);
		System.out.println("totalTimeInHours " + totalTimeInHours);
		
		double metersPerSecond = distanceInMeters / totalTimeInSeconds;
		double kilometersPerHour = (distanceInMeters / 1000) / totalTimeInHours;
		double milesPerHour = (distanceInMeters / 1609) / totalTimeInHours;
		
		System.out.println("metersPerSecond "+ metersPerSecond);
		System.out.println("kilometersPerHour " + kilometersPerHour);
		System.out.println("milesPerHour " + milesPerHour);
		
		sc.close();
		
	}
}