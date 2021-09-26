import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Three{
	public static void main(String[] args){
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("blue");
		colors.add("white");
		colors.add("yellow");
		colors.add("green");
		colors.add("black");
		colors.add("maroon");
		colors.add("red");
		
		System.out.println(colors);
		/*
		colors.add(0,"newBlue");
		System.out.println(colors);
		
		String color = colors.get(2);
		System.out.println(color);
		
		
		colors.set(3,"newColor");
		System.out.println(colors);
		
		colors.remove(3);
		System.out.println(colors);
		
		boolean value = colors.contains("black");
		System.out.println(value);
		*/
		
		List<String> newList = new ArrayList<String>(colors);
		System.out.println(newList);
		
		Collections.sort(colors);
		
		System.out.println(colors);
	}
}