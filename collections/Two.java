import java.util.ArrayList;

class Two{
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
		
		for(String s: colors){
			System.out.println(s);
		}
		
		
	}
}