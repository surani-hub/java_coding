import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Collections;


public class HashMapExample{
	public static void main(String[] args){
	
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		
		System.out.println(hash_map);
		
		System.out.println("entry mappings ");
		Set set = hash_map.entrySet();
		
		System.out.println(set);
		
		String s = hash_map.get(3);
		System.out.println(s);
		
		System.out.println("key mappings");
		Set keys = hash_map.keySet();
		System.out.println(keys);
		
		System.out.println("values mappings");
		System.out.println(hash_map.values());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		HashMap<Integer, String> clonedMap = new HashMap<Integer, String>();
		clonedMap = (HashMap)hash_map.clone();
		
		System.out.println(clonedMap.size());
		
		System.out.println(hash_map.containsKey(4));
		System.out.println(hash_map.get(4));
		
		System.out.println(hash_map.containsValue("Black"));
		*/
		
		/*
		System.out.println(hash_map);
		//hash_map.isEmpty();
		System.out.println(hash_map.isEmpty());
		hash_map.clear();
		System.out.println(hash_map.isEmpty());
		
		
		HashMap<Integer, String> hash_map2 = new HashMap<>();
		hash_map2.put(4,"White");
		hash_map2.put(5,"Blue");
		hash_map2.put(6,"Orange");
		
		System.out.println(hash_map.size());
		
		hash_map.putAll(hash_map2);
		System.out.println(hash_map);
		
		hash_map.clear();
		System.out.println(hash_map);
		*/
		
		//Map.Entry<Integer, String> entries = hash_map.entrySet();
		
		/*
		for(Map.Entry x: hash_map.entrySet()){
			System.out.println(x.getKey() + " " + x.getValue());
		}
		*/
		
	}
}