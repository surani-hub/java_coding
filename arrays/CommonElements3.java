/*
	Find common elements from two arrays having duplicate elements
*/

import java.util.HashSet;

public class CommonElements3{
	public static void main(String[] args){
		int[] arr1 = {5,1,3,4,7,5,7};
		int[] arr2 = {8,10,7,1,2,5,5};  // 5,1,7
		
		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		
		for(int i:arr1){
			hs1.add(i);
		}
		
		for(int i:arr2){
			hs2.add(i);
		}
		
		for(int i:hs1){
		
			boolean b = hs2.add(i);
			if(b==false){
				System.out.print(i +" ");
			}
		}
		
	}
}