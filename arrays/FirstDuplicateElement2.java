/*
	Write a programme to find first duplicate element in an array.
*/

// two ways

import java.util.Scanner;
import java.util.HashSet;

public class FirstDuplicateElement2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		HashSet<Integer> hs = new HashSet<>();
		int temp = -1;
		
	for(int i=arr.length-1;i>=0;i--){
		//for(int i=0;i<arr.length;i++){
			if(hs.contains(arr[i])){
				temp = i;
			}else{
				hs.add(arr[i]);
			}
		}
		
		if(temp != -1){
			System.out.println("first duplicate element is " + arr[temp]);
		}else{
			System.out.println("no duplicate element found");
		}
		
	}
}