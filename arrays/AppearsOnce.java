/*
	Find The Element That Appears Once In An Array Where Every Other Element Appears Twice in Java
*/

// 1 way

import java.util.Scanner;

public class AppearsOnce{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Array elements are ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		int res = arr[0];
		for(int i=1;i<arr.length;i++){
			res = res ^ arr[i];
		}
		
		System.out.println("single element is "+ res);
		
		//System.out.println(5^3^2^9^5^3^2);
		//System.out.println(5^5);
		
	/*  8421
		5 - 0101
		3 - 0011
		---------
		    0110
			*/
	}
}