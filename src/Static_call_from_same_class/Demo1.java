package Static_call_from_same_class;

public class Demo1 {// class open
	
		
		public static void p1() {//p1 open
			System.out.println("gm");
			System.out.println("gn");
		
	}//p1 close
		public static void p2() {// p2 open
			System.out.println("oooooi");
			System.out.println("khfsjhcjk");

}//p2 close

		public static void main(String[] args) {// main method open
				p1();
				p2();
				
			}// main close
}// class close
