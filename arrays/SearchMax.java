/*
	Write java program to find the maximum element in the given array.
*/

import java.util.Scanner;

public class SearchMax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		
		System.out.println("maximum array element is " + max);	
	}
}