import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExercise{
	public static void main(String[] args){
		TreeSet<String> tree_set = new TreeSet<>();
		//tree_set.add();
		tree_set.add("Red");
		tree_set.add("Green");
		tree_set.add("Orange");
		tree_set.add("White");
		tree_set.add("Black");
		
		System.out.println(tree_set);
		
		System.out.println("first element "+tree_set.first());
		System.out.println("last element "+tree_set.last());
		System.out.println();
		
		
		TreeSet<String> cloned_treeset = (TreeSet<String>)tree_set.clone();
		System.out.println(cloned_treeset);
		System.out.println();
		/*
		System.out.println("Reversing order ");
		Iterator<String> itr = tree_set.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println(tree_set.size());
		
		for(String s: tree_set){
			System.out.println(s);
		}
		
		TreeSet<String> tree_set1 = new TreeSet<>();
		tree_set1.add("pink");
		tree_set1.add("maroon");
		tree_set1.add("purple");
		
		tree_set.addAll(tree_set1);
		
		System.out.println(tree_set.size());
		*/
		
	}
}