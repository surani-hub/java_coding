import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.io.IOException;
import java.util.Iterator;
import java.io.File;
import java.io.FilenameFilter;

public class InputOutputExcercise2{
	public static void main(String[] args) throws IOException{
		
		/*
		int count = 0;
		
		File file = new File("D:\\JAVA");
		String[] fileList = file.list(new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name){
				if(name.toLowerCase().endsWith(".java")){
					return true;
				}else{
					return false;
				}
			}
		});
		
		for(String s: fileList){
			count++;
			System.out.println(s);
		}
		
		System.out.println("total files " + count);
		
		*/
		/**/
		int count = 0;
		
		Path path = Paths.get("D:\\JAVA");
		Stream<Path> allFiles = Files.list(path);
		//allFiles.forEach(System.out::println);
		
		System.out.println("***********************************");
		
		for(Iterator<Path> iterator= allFiles.iterator();iterator.hasNext();){
			
			Path p = iterator.next();
			
			
			if(p.getFileName().toString().toLowerCase().endsWith(".java")){
				count++;
				System.out.println(p.getFileName());
			}
		}
		
		System.out.println("total files are " + count);
	/**/
	}
}