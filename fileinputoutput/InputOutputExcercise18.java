/*
	Java Input-Output: Exercise-18 with Solution
	Write a Java program to find the longest word in a text file.
*/

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class InputOutputExcercise18{
	public static void main(String[] args) throws IOException{
		File file = new File("D:\\JAVA\\JavaCodingPractise\\w3resource\\fileinputoutput\\file.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String data = br.readLine();
		
		//List<Integer> wordLengths = new ArrayList<Integer>();;
		
		
		int len = 0;
		
		String[] tokens = data.split(" ");
		String maxString = "";
		
		for(String token:tokens){
			if(len < token.length()){
				len = token.length();
				maxString = token;
			}
			
			//wordLengths.add(len);
		}
		
		//int max = Collections.max(wordLengths);
		
		System.out.println(maxString + " : " + len);
		
		br.close();
	}
}