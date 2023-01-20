package String_class;

public class String_method {
	public static void main(String[] args) {
		String s1="velocity";
		String s2="VELOCITY";
		String s3="city";
		
		//length()
		System.out.println(s1.length());
		// toUppercse
		System.out.println(s1.toUpperCase());
		//tolowercase
		System.out.println(s2.toLowerCase());
		//equals
		System.out.println(s1.equals(s2));
		//equalignorcase
		System.out.println(s1.equalsIgnoreCase(s2));
		//contais
		System.out.println(s1.contains(s3));
		System.out.println(s2.contains(s3));
		//charAt
		System.out.println(s1.charAt(7));
		//index
		System.out.println(s1.indexOf('y'));
		//substring
		System.out.println(s1.substring(4));
		//concat
		System.out.println(s1.concat(s3));
		//startwith
		System.out.println(s1.startsWith("Ve"));
		//endswith
		System.out.println(s1.endsWith("ty"));
	}

}
