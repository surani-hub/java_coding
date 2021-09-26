import java.util.Set;
import java.util.HashSet;

public class FindDuplicateElements2{
	public static void main(String[] args){
		
		int[] arr = {10,2,3,5,10,2,1,91};
		
		Set<Integer> s = new HashSet<Integer>();
		
		for(int ele:arr){
			boolean b = s.add(ele);
			
			if(b == false){
				System.out.println(ele +" ");
			}
		}	
	}
}



