import java.util.TreeSet;

public class TreeSetDemo{
	public static void main(String[] args){
		TreeSet<String> t_set1 = new TreeSet<String>();
          t_set1.add("Red");
          t_set1.add("Green");
          t_set1.add("Black");
          t_set1.add("White");
          System.out.println("Free Tree set: "+t_set1);

          TreeSet<String> t_set2 = new TreeSet<String>();
          t_set2.add("Red");
          t_set2.add("Pink");
          t_set2.add("Black");
          t_set2.add("Orange");
          System.out.println("Second Tree set: "+t_set2);
		  
		  for(String element : t_set1){
			System.out.println(t_set2.contains(element)?"Yes":"No");
		  }
		  
		  
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		TreeSet <Integer>treeheadset = new TreeSet<Integer>();
     
	// Add numbers in the tree
		tree_num.add(1);
		tree_num.add(2);
		tree_num.add(3);
		tree_num.add(5);
		tree_num.add(6);
		tree_num.add(7);
		tree_num.add(8);
		tree_num.add(9);
		tree_num.add(10);
		
		System.out.println("less than "+tree_num.headSet(7));
		System.out.println("greater than or equal to "+tree_num.ceiling(7));
		System.out.println("less than or equal to "+tree_num.floor(4));
		
		System.out.println("strictly greater than "+tree_num.higher(9));
		System.out.println("strictly lesser than "+tree_num.lower(9));
		
		System.out.println(tree_num);
		System.out.println("retrive and remove first element "+tree_num.pollFirst());
		System.out.println(tree_num);
		
		System.out.println("retrive and remove last element "+tree_num.pollLast());
		System.out.println(tree_num);
		
		System.out.println("remove given element "+tree_num.remove(8));
		System.out.println(tree_num);
		
		
	}
}