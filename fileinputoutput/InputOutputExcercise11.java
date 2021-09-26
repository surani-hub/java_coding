import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.PrintWriter;

public class InputOutputExcercise11{
	public static void main(String[] args) throws IOException{
		File file = new File("D:\\JAVA\\JavaCodingPractise\\w3resource\\fileinputoutput\\file.txt");
		
		PrintWriter pw = new PrintWriter(file);
		pw.write("I am ");
		pw.println(" super stupid");
		
		pw.close();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String data = br.readLine();
		//String storeData= "";
		List<String> lines = new ArrayList<String>();
		
		
		while(data != null){
			System.out.println(data);
			lines.add(data);
			//storeData += data;
			data = br.readLine();
		}
		
		System.out.println("arraylist elements : " + lines);
		//System.out.println("storing the data in a variable : " + storeData);
		br.close();
		
	}
}