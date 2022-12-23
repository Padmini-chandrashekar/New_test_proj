import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;


public class LinkeList {

	public static void main(String[] args) {
		LinkedList<Integer> obj=new LinkedList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		System.out.println(obj);
		obj.set(1, 70);
		System.out.println(obj);
		obj.addFirst(80);
		System.out.println(obj);
		obj.addLast(90);
		System.out.println(obj);
		obj.remove();
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
		
		
		
	}

}
