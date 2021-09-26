/*
	Java Input-Output: Exercise-17 with Solution
	Write a Java program to read first 3 lines from a file.
*/

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class InputOutputExcercise17{
	public static void main(String[] args) throws IOException{
		File file = new File("D:\\JAVA\\JavaCodingPractise\\w3resource\\fileinputoutput\\file.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		//String data = br.readLine();
		
		LineNumberReader reader = new LineNumberReader(br);
		String data = reader.readLine();
		while((data != null) && (reader.getLineNumber() <=3) ) {
			System.out.println(data);
			data = reader.readLine();
		}
		
		reader.close();
		
		br.close();
	}
}