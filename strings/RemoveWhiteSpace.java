/*
	Remove white spaces in a string
*/

public class RemoveWhiteSpace{
	public static void main(String[] args){
		String str = "   ja         v      a     ";
		
		System.out.println(str.replaceAll("\\s",""));
	}
}