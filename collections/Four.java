import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Four{
	public static void main(String[] args){
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("blue");
		colors.add("white");
		colors.add("yellow");
		colors.add("green");
		colors.add("black");
		colors.add("maroon");
		colors.add("red");
		colors.add("One");
		colors.add("Two");
		System.out.println(colors);
		
		//ArrayList<String> newList = (ArrayList<String>)colors.clone();
		//System.out.println(newList);
		
		Collections.swap(colors, 0,colors.size()-1);
		System.out.println(colors);
		
		/*
		System.out.println(colors.size());
		
		for(int i=0;i<colors.size();i++){
			System.out.println(i+" "+ colors.get(i));
			
		}
		
		colors.set(2,"white");
		System.out.println(colors);
		colors.ensureCapacity(20);
		colors.add("b");
		colors.add("m");
		colors.add("r");
		colors.add("O");
		colors.add("T");
		System.out.println(colors.size());
		
		colors.trimToSize();
		System.out.println(colors.size());
		
		boolean value = colors.isEmpty();
		System.out.println("isEmpty : " + value);
		
		colors.removeAll(colors);
		System.out.println(colors.isEmpty());
		*/
		
		
		/*
		Collections.shuffle(colors);
		System.out.println(colors);
		
		List<String> newList = new ArrayList<String>();
		newList.add("b");
		newList.add("w");
		newList.add("y");
		newList.add("g");
		newList.add("f");
		newList.add("m");
		newList.add("r");
		newList.add("s");
		newList.add("t");
		newList.add("x");
		newList.add("z");
		
		System.out.println(newList);
		
		Collections.copy(colors, newList);
		System.out.println("after copying: "+newList);
		System.out.println("after copying: "+colors);
		*/
		
	}
}