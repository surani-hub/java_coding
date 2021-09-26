/*
	Write java program to sort the array in ascending order and print the second smallest element.
*/

// time complexity is O(n2);

// can you reduce the time complexity?


import java.util.Scanner;

public class SecondSmallest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		int temp;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int ele:arr){
			System.out.print(ele+" ");
		}
		System.out.println();
		
		System.out.println("second smallest element is " + arr[1]);
	}
}