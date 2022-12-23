import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.platform.commons.annotation.Testable;
@Testable
public class Array {

	public static void main(String[] args) {
	Queue<Integer> q=new PriorityQueue<Integer>();
	q.add(10);
	q.add(20);
	q.add(30);
	q.add(40);
	System.out.println(q.element());
	System.out.println(q.peek());
	System.out.println(q.poll());
	System.out.println(q);
	
	
	

	}

}
