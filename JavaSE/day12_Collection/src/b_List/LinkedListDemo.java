package b_List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		for (int i = 0; i < 4; i++) {
			ll.addFirst(i);
		}
		System.out.println(ll);
		
		ll.addLast("b");
		System.out.println(ll);
		
		ll.add(3, "c");
		System.out.println(ll);
		//±éÀú
		for (Iterator  it = ll.iterator(); it.hasNext();) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
					
//		ll.add("e");
//		System.out.println(ll);
		
		ll.addAll(ll);
		System.out.println(ll);
		ll.addAll(2, ll);
		System.out.println(ll);
		System.out.println("-------------------------------");
		
		//É¾³ý
//		ll.clear();
//		System.out.println(ll);
//		System.out.println("--------------------------------");
		
		//¸´ÖÆ
		Object object = ll.clone();
		System.out.println(object);
		System.out.println("--------------------------------");
		
	}
		
}
