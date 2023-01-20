package Exception;

public class Arithmatic_exception {
	public static void main(String[] args) {
		int a=1;
		int b=0;
		
	
 try {
	 int c=a/b; // risky code
	 System.out.println(c);
 }
 catch(Throwable monday) {
	 System.out.println("exception is handled");
 }
//.out.println("shruti");
}

}

