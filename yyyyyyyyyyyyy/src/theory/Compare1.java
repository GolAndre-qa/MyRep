package theory;

public class Compare1 {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		boolean res1 = (s1 == s2);
		
		System.out.println("Result1: " + res1);
		
//		================
		
		s1 = s2;
		
		boolean res2 = (s1 == s2);
		
		System.out.println("Result2: " + res2);
		
//		================
		
		s1 = new String(s2);
		
		boolean res3 = (s1 == s2);
		
		System.out.println("Result3: " + res3);
		
		boolean res3a = s1.equals(s2);
		
		System.out.println("Result3a: " + res3a);
		
		
//		================
		
		String s3 = "abc";
		String s4 = "abc";

		boolean res4 = (s3 == s4);
		
		System.out.println("Result3: " + res4);

	}

}
