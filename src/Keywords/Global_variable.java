package Keywords;

public class Global_variable {
	static int j=25;// static global variable
	int i=20;//non static global variable
	public static void main(String[] args) {
		Global_variable g= new Global_variable ();// object creation
		System.out.println(j);
		System.out.println(g.i);
	}

}
