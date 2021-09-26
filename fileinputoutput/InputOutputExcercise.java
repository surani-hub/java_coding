import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.io.IOException;
import java.util.Iterator;
import java.io.File;
import java.util.Date;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputOutputExcercise{
	public static void main(String[] args) throws IOException{
		
		/*
		
		int count = 0;
		
		File file = new File("D:\\JAVA");
		String[] fileList = file.list();
		
		for(String s: fileList){
			count++;
			System.out.println(s);
		}
		
		System.out.println("total files " + count);
		*/
		
		File fileName = new File("D:\\JAVA\\Basic.java");
		
		long fileLen = fileName.length();
		System.out.println("file length " + fileLen);
		
		long lastTime = fileName.lastModified();
		Date date = new Date(lastTime);
		System.out.println("last modified time is " + date);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println(name );
		
		/*
		if(fileName.isDirectory()){
			System.out.println("directory " + fileName.getAbsolutePath());
		}
		
		if(fileName.isFile()){
			System.out.println("file " + fileName.getAbsolutePath());
		}
		
		
	   String str1 = "Java exercises";
       String str2 = "Java exercises";
       String str3 = "Java examples";

       int var1 = str1.compareTo( str2 );
       System.out.println("str1 & str2 comparison: "+var1);

       int var2 = str3.compareTo( str1 );
       System.out.println("str1 & str3 comparison: "+var2);
	   */
	   
		/*
		if(fileName.exists()){
			System.out.println("exists " + fileName.getAbsolutePath());
		}
		
		
		if(fileName.canRead()){
			System.out.println("readable " + fileName.getAbsolutePath());
		}
		
		if(fileName.canWrite()){
			System.out.println("writable " + fileName.getAbsolutePath());
		}
		*/
		
		/*
		int count = 0;
		
		Path path = Paths.get("D:\\JAVA");
		Stream<Path> allFiles = Files.list(path);
		//allFiles.forEach(System.out::println);
		
		System.out.println("***********************************");
		
		for(Iterator<Path> iterator= allFiles.iterator();iterator.hasNext();){
			count++;
			Path p = iterator.next();
			System.out.println(p.getFileName());
		}
		
		System.out.println("total files are " + count);
	*/
	}
}