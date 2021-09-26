import java.util.Set;
import java.util.Map;
import java.util.Hashtable;

public class FindDuplicateElements3{
	public static void main(String[] args){
		Map<Integer, Integer> m = new Hashtable<>();
		
		int[] arr = {10,2,3,5,10,2,1,91,2,3,2,1,2,3,1};
		
		for(int ele:arr){
			Integer ref = m.get(ele);
			
			if(ref == null){
				m.put(ele, 1);
			}else{
				ref = ref+1;
				m.put(ele, ref);
			}
		}
		
		System.out.println("duplicate elements are ");
		Set<Map.Entry<Integer, Integer>> entryset = m.entrySet();
		for(Map.Entry<Integer, Integer> mapentry : entryset){
			if(mapentry.getValue()>1){
				System.out.print(mapentry.getKey()+" ");
			}
		}
	}
}