/*
	Find common elements between two arrays of strings
*/

public class CommonElementsOfStrings{
	public static void main(String[] args){
		String[] arr1 = {"Java", "Scala", "Python"};
		String[] arr2 = {".Net", "Scala", "Clojure", "Java", "Java Script", "Python"}; // Java Scala Python
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i].equals(arr2[j])){
					System.out.print(arr1[i]+" ");
				}
			}
		}
		
	}
}