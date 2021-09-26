/*
	Longest consecutive sequence in a array.
*/

import java.util.Arrays;

public class LongestSubSequence{
	public static void main(String[] args){
		int[] arr = {1,12,15,9,3,10,14,4,11,20,2,13};
		
		Arrays.sort(arr);
		
		System.out.println("sorted array elements are ");
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
		
		int longest_sequence = 0, count =1;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]+1 == arr[i+1]){
				count++;
			}else{
				count = 1;
			}
			
			longest_sequence = Math.max(longest_sequence,count);
		}
		
		System.out.println("longest subsequence length is " + longest_sequence);
	}
}