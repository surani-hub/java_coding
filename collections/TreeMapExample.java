import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class TreeMapExample{
	public static void main(String[] args){
		
		
		/*
		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
		tree_map.put(1,"Red");
		tree_map.put(2,"Green");
		tree_map.put(3,"Black");
		tree_map.put(4,"White");
		tree_map.put(5,"Blue");
		//tree_map.put();
		//tree_map.put();
		
		System.out.println(tree_map);
		
		for(Map.Entry<Integer, String> entry : tree_map.entrySet()){
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		*/
		
		//TreeMap<String,String> tree_map1=new TreeMap<String,String>((k1,k2)->k1.compareTo(k2));  

		//TreeMap<String,String> tree_map1=new TreeMap<String,String>((k1,k2)->k2.compareTo(k1));  
  
		/*
		TreeMap<String,String> tree_map1=new TreeMap<String,String>();
		
		// Put elements to the map 
		tree_map1.put("C1", "Red");
		tree_map1.put("C2", "Green");
		tree_map1.put("C3", "Black");
		tree_map1.put("C4", "White");
		tree_map1.put("C5", "Blue");
		
		System.out.println("Tree Map 1: "+tree_map1);
		
		System.out.println("lowest key- value mapping: "+tree_map1.firstEntry());
		
		System.out.println("highest key- value mapping: "+tree_map1.lastEntry());
		
		System.out.println("lowest key: "+tree_map1.firstKey());
		
		System.out.println("highest key: "+tree_map1.lastKey());
		
		System.out.println("reverse order view of keys : "+tree_map1.descendingKeySet());
		*/
		
		TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
		// Put elements to the map 
		tree_map1.put(10, "Red");
		tree_map1.put(20, "Green");
		tree_map1.put(40, "Black");
		tree_map1.put(50, "White");
		tree_map1.put(60, "Pink");
		
		/*
		System.out.println("to remove and get a key-value mapping associated with the least key " + tree_map1.pollFirstEntry());
		System.out.println("Tree Map 1: "+tree_map1);
			
		System.out.println("to remove and get a key-value mapping associated with the greatest key " + tree_map1.pollLastEntry());
		System.out.println("Tree Map 1: "+tree_map1);
		
		System.out.println("Sub map key-values: " + tree_map1.subMap(20,40));
		System.out.println("Sub map key-values: " + tree_map1.subMap(20,true,40,true));
		
		System.out.println("keys strictly >= given key: "+tree_map1.tailMap(40));
		System.out.println("keys : " +tree_map1.tailMap(40, false));
		*/
		
		/*
		System.out.println("Tree Map 1: "+tree_map1);
		System.out.println("Navigable key set : "+tree_map1.navigableKeySet());
  
		System.out.println("key value mappings with <= the key " + tree_map1.floorEntry(30));
		System.out.println("key value mappings with >= key "+ tree_map1.ceilingEntry(30));
		
		System.out.println("key value mappings strictly > given key " + tree_map1.higherEntry(30));
		System.out.println("key value mappings strictly < given key "+ tree_map1.lowerEntry(30));
		
		System.out.println("key <= : "+tree_map1.floorKey(30));
		System.out.println("key >= : "+tree_map1.ceilingKey(30));
		
		System.out.println("key strictly > : "+tree_map1.higherKey(30));
		System.out.println("key strictly < : "+tree_map1.lowerKey(30));
		
		System.out.println("keys strictly < given key: "+tree_map1.headMap(40));
		System.out.println("keys : "+tree_map1.headMap(40, true));
		*/
		
		/*
		Set<String> keys = tree_map1.keySet();
		for(String s: keys){
			System.out.println(s);
		}
		*/
		
		/*
		TreeMap<String,String> tree_map2 = new TreeMap<String,String>();
		tree_map2.put("A1", "Orange");
		tree_map2.put("A2", "Pink");
		
		System.out.println("Tree Map 2: "+tree_map2);
		
		tree_map1.putAll(tree_map2);
		System.out.println("Tree Map 1: "+tree_map1);
		
		boolean value = tree_map2.containsKey("A1");
		System.out.println(value);
		
		boolean key = tree_map2.containsValue("Orange");
		System.out.println(key);
		*/
		
	}
}