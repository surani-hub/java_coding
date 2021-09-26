/*
	Follow up question :
How to find the missing number in an unsorted Array with duplicate elements.

Examples :
Integer[] input = {10,9,6,7,7,9,10,3,4,3,5,1,2}

Output : 
Missing number in an array : 8


Integer[] input = {6,1,4,2,3,3,1,6}

Output :
Missing number in an array : 5

*/

import java.util.List;
import java.util.HashSet;
import java.util.Arrays;

public class MissingNumberInUnsorted{
	public static void main(String[] args){
		
	//	Integer[] input = {10,9,6,7,7,9,10,3,4,3,5,1,2}; // 8
		
		Integer[] input = {6,1,4,2,3,3,1,6};  //5
		List list = Arrays.asList(input);
		
		HashSet<Integer> hs = new HashSet<>(list);
	//	System.out.println(hs);
		int size = hs.size();
	//	System.out.println(size); 9
		
		int n_sum = sumOfAllNnumbers(size);
		int array_sum = sumOfArrayElements(hs);
		
	//	System.out.println(n_sum);
	//	System.out.println(array_sum);
		
		System.out.println("missing element is " + (n_sum-array_sum));
	}
	
	public static int sumOfArrayElements(HashSet<Integer> hs){
		int sum = 0;
		for(Integer i:hs){
			sum += i;
		}
		return sum;
		
	}
	public static int sumOfAllNnumbers(int size){
		int sum = 0;
		for(int i=1;i<=size+1;i++){
			sum += i;
		}
		return sum;
	}
}