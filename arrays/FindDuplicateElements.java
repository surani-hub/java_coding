/*
	6. Write a program to find duplicate element element in an integer array?
*/

import java.util.Scanner;

public class FindDuplicateElements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		/*
		int[] arr = {10,2,3,5,10,2,1,91}; // 10,2
		*/
		
		for(int i=0;i<arr.length;i++){
			int count = 0;
				for(int j=i+1;j<arr.length;j++){
					if(arr[i] == arr[j]){
						count++;
					}
				}
			
			if(count>0){
				System.out.print(arr[i] + " ");
			}
		
		}
	}
}