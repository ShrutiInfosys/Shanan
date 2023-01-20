package collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector a = new Vector();
		a.add("Raj");
		a.add(100);
		a.add('A');
		a.add(null);
		
		System.out.println(a);
		//empty or not
		System.out.println(a.isEmpty());
		//size of collection
		System.out.println(a.size());
		//contain or not'
		System.out.println(a.contains(200));//false
		//get index
		System.out.println(a.get(3));
		//Iterator
		Iterator itr = a.iterator();
		
			while(itr.hasNext())
					 {
				System.out.println(itr.next());
				
			}
			//listiterator
			ListIterator litr = a.listIterator();
			while(litr.hasNext()){
				System.out.println(litr.next());
				
			}
			//enumation
			Enumeration en = a.elements();
			while(en.hasMoreElements()) {
				System.out.println(en.nextElement());
		}
		//using for each loop
			for(Object al:a) {
				System.out.println(a);
			}
}

}
