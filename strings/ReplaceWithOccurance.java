/*
	To replace each character with its occurance in a string.
	input => opentext
	replace "t" with its occurance
	output => open1ex2
*/

public class ReplaceWithOccurance{
	public static void main(String[] args){
		String str = "opentext";
		char charToBeReplaced = 't';
		
		if(str.indexOf(charToBeReplaced)==-1){
			System.out.println("invalid character");
			System.exit(0);
		}
		
		int count = 1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==charToBeReplaced){
				str = str.replaceFirst(String.valueOf(charToBeReplaced) , String.valueOf(count));
				count++;
			}
		}
		
		System.out.println(str);
	}
}









