/*
	Write a programme to find first duplicate element in an array.
*/

// two ways

import java.util.Scanner;

public class FirstDuplicateElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			int count = 0;
				for(int j=i+1;j<arr.length;j++){
					if(arr[i] == arr[j]){
						count++;
						break;
					}
				}
			
			if(count>0){
				System.out.print("first duplicate element is " +arr[i] + " ");
				break;
			}
		
		}
		
		
		
	}
}