package collection;
import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List1 {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add("shruti");
		al.add(100);
		al.add('A');
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(200));
		System.out.println(al.get(0));
		
		ListIterator litr =al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
			
			for(Object s:al)
			{
				System.out.println(s);
			}
		}
	}

}
