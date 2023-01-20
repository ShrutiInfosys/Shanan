package Aarray;

public class rev_name {
	public static void main(String[] args) {
		String [] a = new String[1];
		a[0]="RAM";
		
		String s= a[0];
		System.out.println(s);
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i) );
		}
	}

}
