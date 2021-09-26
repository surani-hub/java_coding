/*
	Find Missing Number In Array In Java.
	
	find the missing number in an array of integers of length n-1 containing integer values from 1 to n.
	The given Array does not contain duplicates or occurrence of each integer value is only once using XOR.
	
*/

public class MissingNumber1{
	public static void main(String[] args){
		int[] input = {10,9,6,7,4,3,5,1,2}; // 8
		//int[] input = {6,1,4,2,3};  // 5
		
		int xor = input[0];
		for(int i:input){
			xor = xor ^ i;
		}
		
		int xor1 = 1;
		for(int i=2;i<=input.length;i++){
			xor1 = xor1 ^i;
		}
		
		System.out.println("missing number is " + (xor ^ xor1));
	}
}