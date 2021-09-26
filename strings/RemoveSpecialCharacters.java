/*
	Write a java program to remove special characters from the string.
*/

public class RemoveSpecialCharacters{
	public static void main(String[] args){
		String str = "$j&a#va?Str^i!ng*";
		
		System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
	}
}