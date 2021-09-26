import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collections;

public class LinkedListExercise{
	public static void main(String[] args){
		LinkedList<String> l_list = new LinkedList<>();
		
		l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");
		  
		System.out.println(l_list);
		
		/*
		for(int i=0;i<l_list.size();i++){
			System.out.println(i + " " + l_list.get(i));
		}
		  
		  l_list.remove(1);
		System.out.println(l_list);

		System.out.println(l_list.removeFirst());
		System.out.println(l_list);
		System.out.println(l_list.removeLast());
		  System.out.println(l_list);
		  l_list.clear();
		  System.out.println(l_list);
		 
		 
		 Collections.swap(l_list, 2,4);
		  System.out.println(l_list);
		  
		  Collections.shuffle(l_list);
		  System.out.println(l_list);
		 

		LinkedList<String> clonedList = new LinkedList<String>();
		clonedList = (LinkedList<String>)l_list.clone();
		  
		System.out.println(clonedList);
		
		System.out.println(l_list.pollFirst());
		System.out.println(l_list);
		System.out.println(l_list.pollLast());
		System.out.println(l_list);
		
		System.out.println(l_list.peekFirst());
		System.out.println(l_list);
		System.out.println(l_list.peekLast());
		System.out.println(l_list);
		*/
		
		System.out.println(l_list.contains("Red"));
		
		//l_list.toArray();
		
		LinkedList<String> c1= new LinkedList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");

          LinkedList<String> c2= new LinkedList<String>();
          c2.add("Red");
          c2.add("Green");
          c2.add("Black");
          c2.add("Orange");

          //comparison output in linked list
          LinkedList<String> c3 = new LinkedList<String>();
          for (String e : c1)
             c3.add(c2.contains(e) ? "Yes" : "No");
          System.out.println(c3); 
		
		System.out.println(c2.isEmpty());
		  
		  System.out.println(c2.set(1,"Second"));
		  System.out.println(c2);
		  
		  /*
		  LinkedList <String> new_l_list = new LinkedList <String> ();
			new_l_list.add("White");
			new_l_list.add("Pink");
			
			l_list.addAll(1, new_l_list);
		  System.out.println(l_list);
		  
		  System.out.println(l_list.peekFirst());
		  System.out.println(l_list.peekLast());
		  
		  System.out.println(l_list.getFirst());
		  System.out.println(l_list.getLast());
		 */		  
		  
		  
		  /*
		  l_list.add(2,"Maroon");
		  
		  System.out.println(l_list);
		  
		  l_list.addFirst("Start");
		  l_list.addLast("End");
		  
		  System.out.println(l_list);
		  
		  l_list.offerFirst("Front_List");
		  l_list.offerLast("End_List");
		  System.out.println(l_list);
		  
		  
		  ListIterator<String> itr = l_list.listIterator(3);
		  while(itr.hasNext()){
			  System.out.println(itr.next());
		  }
		  
		  System.out.println();
		  
		  System.out.println("Descending order");
		  Iterator<String> descendingOrder = l_list.descendingIterator();
		  while(descendingOrder.hasNext()){
			  System.out.println(descendingOrder.next());
		  }
		  */
		  
		  
	}
}