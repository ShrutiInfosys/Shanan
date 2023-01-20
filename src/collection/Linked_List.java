package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class Linked_List {
	public static void main(String[] args) {
		LinkedList Li = new LinkedList();
		Li.add("Sham");
		Li.add(200);
		Li.add('S');
		Li.add(null);
		
		System.out.println(Li);
		System.out.println(Li.size());
		System.out.println(Li.contains(300));
		System.out.println(Li.isEmpty());
		
		Iterator itr=Li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ListIterator litr=Li.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		for(Object a:Li) {
			System.out.println(a);
		}
		
		
		
		}

}
