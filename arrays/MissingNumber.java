/*
	Find Missing Number In Array In Java.
	
	find the missing number in an array of integers of length n-1 containing integer values from 1 to n.
	The given Array does not contain duplicates or occurrence of each integer value is only once.
*/

public class MissingNumber{
	public static void main(String[] args){
//		int[] input = {10,9,6,7,4,3,5,1,2}; // 8
		int[] input = {6,1,4,2,3};  // 5
		int sum = 0, newSum=0;
		
		for(int i=0;i<input.length;i++){
			sum += input[i];
		}
		System.out.println("array sum " + sum);
		
		int expected_elements = input.length+1;
		int total_sum = expected_elements * (expected_elements+1)/2;
		
		/*
		for(int k=1;k<=input.length+1;k++){
			newSum += k;
		} 
		System.out.println("element sum " + newSum);
		*/
		
	//	System.out.println("missing number is " + (newSum-sum));
		
		System.out.println("missing number is " + (total_sum-sum));
	}
}