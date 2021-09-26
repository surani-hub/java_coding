/*
	Reverse words in a string
	input -> i love sudha and rani
	output -> rani and sudha love i
*/

public class ReverseWords{
	public static void main(String[] args){
		String str = "i love sudha and rani";
		
		String[] words = str.split(" ");
		
		for(int i=words.length-1;i>=0;i--){
			System.out.print(words[i] +" ");
		}
	}
}