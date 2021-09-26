import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PriorityQueueExercise{
	public static void main(String[] args){
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(10);
      
		// Add numbers in the Queue
		pq1.add(10);
		pq1.add(22);
		pq1.add(36);
		pq1.add(25);
		pq1.add(16);
		pq1.add(70);
		pq1.add(82);
		pq1.add(89);
		pq1.add(14);
		System.out.println("\nOriginal Priority Queue: "+pq1);
		
		System.out.println(pq1.size());
		//System.out.println(pq1.poll());
		
		System.out.println("before maximizing");
		Integer value1 = null;
		while((value1 = pq1.poll())!= null){
			System.out.println(value1);
		}
		System.out.println(pq1.size());
		System.out.println();
		
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(10, Collections.reverseOrder());
      
		// Add numbers in the Queue
		pq2.add(10);
		pq2.add(22);
		pq2.add(36);
		pq2.add(25);
		pq2.add(16);
		pq2.add(70);
		pq2.add(82);
		pq2.add(89);
		pq2.add(14);
		System.out.println("\nOriginal Priority Queue: "+pq2);
		
		System.out.println(pq2.size());
		//System.out.println(pq2.poll());
		
		System.out.println("After maximizing ");
		Integer value2 = null;
		while((value2 = pq2.poll())!= null){
			System.out.println(value2);
		}
		System.out.println(pq1.size());
		System.out.println();
		
   
		/*
		PriorityQueue<String> queue1 = new PriorityQueue<>();
		queue1.add("Red");
		queue1.add("Green");
		queue1.add("Orange");
		queue1.add("White");
		queue1.add("Black");
		
		System.out.println("queue1 elements are " + queue1);
		
		System.out.println(queue1.peek());
		
		System.out.println(queue1.poll());
		System.out.println("after removing first element from queue1  " + queue1);
		
		List<String> array_list = new ArrayList<>(queue1);
		System.out.println(array_list);
		
		String s = queue1.toString();
		System.out.println("String representation " + s);
		*/
		
		/*
		queue1.offer("Blue");
		
		System.out.println("queue1 elements are " + queue1.size());
		
		queue1.clear();
		
		System.out.println("queue1 elements are " + queue1);
		*/
		
		/*
		PriorityQueue<String> queue2 = new PriorityQueue<>();
		//queue2.add("Red");
		//queue2.add("Green");
		//queue2.add("Orange");
		queue2.add("pink");
		queue2.add("White");
		queue2.add("Black");
		
		//System.out.println(queue);
		System.out.println("queue2 elements are " + queue2);
		
		System.out.println();
		
		PriorityQueue<String> queue3 = new PriorityQueue<>();
		//queue3.addAll(queue1);
		//queue3.addAll(queue2);
		
		System.out.println("queue3 elements are " + queue3);
		
		for(String s: queue1){
			queue3.add(queue2.contains(s)?"Yes":"No");
		}
		System.out.println("queue3 elements are " + queue3);
		*/
		
		/*
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		*/
	}
}