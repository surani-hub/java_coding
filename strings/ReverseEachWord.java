/*
	Reverse each word in a string
	input -> java code
	output -> avaj edoc
*/

public class ReverseEachWord{
	public static void main(String[] args){
		String str = "java code";
		
		String[] words = str.split(" ");
		String output="";
		
		for(String word: words){
			String rev ="";
			for(int i=word.length()-1;i>=0;i--){
				rev = rev + word.charAt(i);
			}
			output += rev+" ";
		}
		System.out.println(output);
	}
}