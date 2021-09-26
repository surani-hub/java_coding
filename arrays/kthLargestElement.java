/*
	Write a java programme to find the kth largest element in the array?
*/

import java.util.Scanner;

public class kthLargestElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the kth position");
		int k = sc.nextInt();
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){        // sorts the array in descending order
					int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
				}
			}
			
			if(i==k-1){
				System.out.println(k+"th largest element is "+ arr[i]);
			}
		}
		
		for(int ele:arr){
			System.out.print(ele+" ");
		}
		System.out.println();
		
	}
}