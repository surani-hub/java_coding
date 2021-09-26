import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.Files;


public class InputOutputExcercise{
	public static void main(String[] args){
	
		Paths path = Path.get("D:\\JAVA");
		//File file = new File("D:\\JAVA");
		
		//file.
		
		Stream<Path> allFiles = Files.list(path);
		for(Path s: allFiles){
			System.out.println(s.getFileName());
		}
		
	}
}