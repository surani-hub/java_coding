/*
	Print the Number of Odd and Even Numbers | Sum & Count of Even or Odd Numbers in an Array in Java
*/

//  number of even and odd numbers
//  sum of even and odd numbers
//  count of even and odd numbers


import java.util.Scanner;
import java.util.ArrayList;

public class CountOfEvenOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();
		
		for(int i:arr){
			if(i%2==0){
				evenList.add(i);
			}else{
				oddList.add(i);
			}
		}
		
		int evenSum = 0;
		System.out.println("Even numbers are ");
		for(int x:evenList){
			evenSum += x;
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("evenList count is "+ evenList.size());
		System.out.println("evenSum is " + evenSum );
		
		int oddSum = 0;
		System.out.println("Odd numbers are ");
		for(int x:oddList){
			oddSum += x;
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("oddList count is "+ oddList.size());
		System.out.println("oddSum is " + oddSum );
		
	}
}