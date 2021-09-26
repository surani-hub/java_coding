/*
	Java Data Type: Exercise-5 with Solution
Write a Java program that prints the current time in GMT.

GMT: Greenwich Mean Time (GMT) is the mean solar time at the Royal Observatory in Greenwich, London. GMT was formerly used as the international civil time standard, now superseded in that function by Coordinated Universal Time (UTC).

Test Data
Input the time zone offset to GMT: 256

*/

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise5{
	public static void main(String[] args){
		Instant instant = Instant.now();
		System.out.println("GMT => " + ZonedDateTime.ofInstant(instant, ZoneId.of("GMT")));
		System.out.println();
		System.out.println("UTC => " + ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("UTC")));
		System.out.println();
		System.out.println("Asia => " + ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Asia/Calcutta")));
		System.out.println();
		System.out.println("US => " + ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("US/Pacific")));
		System.out.println();
		System.out.println("Europe => " + ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/London")));
		System.out.println();
		


	}
}