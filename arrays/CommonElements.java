/*
	Find common elements from two arrays having distinct elements
*/

public class CommonElements{
	public static void main(String[] args){
		int[] arr1 = {5,1,3,4,7,5};
		int[] arr2 = {8,10,7,1,2,5};  // 1,7
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.print(arr1[i]+" ");
				}
			}
		}
		
	}
}