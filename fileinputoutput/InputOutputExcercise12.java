import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class InputOutputExcercise12{
	public static void main(String[] args) throws IOException{
		File file = new File("D:\\JAVA\\JavaCodingPractise\\w3resource\\fileinputoutput\\file.txt");
		FileWriter fw = new FileWriter(file, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("Usain Bolt");
		pw.println("Elon Musk");
		pw.println("Steve Jobs");
		pw.write(100);
		pw.print(12.42);
		
		pw.close();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String data = br.readLine();
		
		while(data != null){
			System.out.println(data);
			data = br.readLine();
		}
		br.close();
	}
}