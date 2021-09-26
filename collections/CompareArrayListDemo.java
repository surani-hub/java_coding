import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class CompareArrayListDemo{
	public static void main(String[] args){
		ArrayList<String> c1= new ArrayList<String>();
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");
	
		System.out.println("before reversing: "+ c1);
		
		for(int i=c1.size()-1;i>=0;i--){
			System.out.println(c1.get(i));
		}
		  
		Collections.reverse(c1);
		System.out.println("after reversing: "+ c1);
		  
		  
		 /*		 
		ArrayList<String> c2= new ArrayList<String>();
          c2.add("Red");
          c2.add("Green");
          c2.add("Black");
          c2.add("Pink");
		  
		ArrayList<String> c3 = new ArrayList<>();
		
		for(String e: c1){
			c3.add(c2.contains(e) ? "Yes" : "No");
		}
		  
		System.out.println(c3);
		
		for(int i=0;i<c1.size();i++){
			if(i == 3){
				break;
			}
			
			System.out.print(" "+c1.get(i));
		}
		
		System.out.println();
		
		List<String> list = c1.subList(0,3);
		System.out.println(list);
		*/
		
	}
}