package Static_call_from_same_class;

public class Demo {//open class body
	public static void main(String[] args) {//main method open
		m1();
		m2();
		
		
	}//main method close

public static void m1() {
	System.out.println("I am running from regular method m1");
}
public static void m2() {
	System.out.println("I am running from regular method m2");
}
}//close class body


