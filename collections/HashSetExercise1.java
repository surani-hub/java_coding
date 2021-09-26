import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;


/*
	no duplicates,
	based on hashCode(), elements sorted
	
*/
class HashSetExercise1{
	public static void main(String[] args){
		HashSet<String> hs = new HashSet<String>();
		hs.add("Red");
		hs.add("Green");
		hs.add("Black");
		hs.add("White");
		
		System.out.println(hs);
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Red");
		hs1.add("Pink");
		hs1.add("Black");
		hs1.add("Orange");
		
		System.out.println(hs1);
		
		/*
		for(String e: hs){
			System.out.println(hs1.contains(e)?"Yes":"No"));
		}
		*/
		
		hs.retainAll(hs1);
		System.out.println(hs);
		
		//hs.removeAll(hs);
		hs.clear();
		System.out.println(hs);

		
		/*
		hs.add("Yellow");
		System.out.println(hs);
		
		// - converting HashSet to TreeSet
		Set<String> tree_set = new TreeSet<String>(hs);
		
		System.out.println("treeset elements are ");
		for(String s:tree_set){
			System.out.println(s);
		}
		
		System.out.println("***********************************");
		
		// - converting HashSet to List
		List<String> list = new ArrayList<String>(hs);
		System.out.println("list elements are " + list);
		for(String s:list){
			System.out.println(s);
		}
		*/		
		
		/*
		HashSet<String> set = (HashSet<String>)hs.clone();
		System.out.println(set);
		
		
		Object[] setConvertedToArray = set.toArray();
		for(Object s: setConvertedToArray){
			System.out.println(s);
		}
		
		
		String[] newArray = new String[set.size()];
		set.toArray(newArray);
		
		for(String ele:newArray){
			System.out.print(ele+", ");
		}
		*/
		
		/*
		Iterator itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			//hs.remove();
		}
		
		hs.removeAll(hs);
		System.out.println("Number of elements is " + hs);
		
		System.out.println("Number of elements is " + hs.isEmpty());
		
		System.out.println("Number of elements is " + hs.size());
		*/
		
	}
}