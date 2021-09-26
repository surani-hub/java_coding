import java.io.File;

public class InputOutputExcercise9{
	public static void main(String[] args){
		File file = new File("D:\\JAVA\\Bar.java");
		
		if(file.exists()){
			filesize_bytes(file);
			filesize_kiloBytes(file);
			filesize_megaBytes(file);
		}
	}
	
	public static void filesize_bytes(File file){
		
		long l = file.length();
		System.out.println("filesize in " + l + " bytes.");
	}
	
	public static void filesize_kiloBytes(File file){
		double l = (double)file.length() / 1024;
		System.out.println("filesize in " + l + " kilobytes.");
		
	}
	
	public static void filesize_megaBytes(File file){
		double l = (double)file.length() / (1024 * 1024) ;
		System.out.println("filesize in " + l + " megabytes.");
		
	}
	
	
}