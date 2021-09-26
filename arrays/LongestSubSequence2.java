/*
	Longest consecutive sequence in a array.
*/

import java.util.HashSet;

public class LongestSubSequence2{
	public static void main(String[] args){
		int[] arr = {1,12,15,9,3,10,14,4,11,20,2,13};
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++){
			hs.add(arr[i]);
		}
		
		int long_len = 0;
		
		for(int i=0;i<arr.length;i++){
			if(!hs.contains(arr[i]-1)){
				int no = arr[i];
				
				while(hs.contains(no)){
					no++;
				}
				
				if(long_len < no-arr[i]){
					long_len = no-arr[i];
				}
			}
		}
		
		System.out.println("longest subsequence length is " + long_len);
	}
}