/*
	Find common elements from two arrays having duplicate elements
*/

import java.util.HashSet;

public class CommonElements2{
	public static void main(String[] args){
		int[] arr1 = {5,1,3,4,7,5};
		int[] arr2 = {8,10,7,1,2,5};  // 5,1,7
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i:arr1){
			hs.add(i);
		}
		
		for(int i:arr2){
			boolean b = hs.add(i);
			if(b==false){
				System.out.print(i +" ");
			}
		}
		
	}
}