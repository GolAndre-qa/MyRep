
public class StringToChar {

	public static void main(String[] args) {

//		String str2 = "";
//		String str2 = " ";
//		String str2 = "Abcd";
//		String str2 = "1bcd";
//		String str2 = "abcd";
		String str2 = " abcd";
		if (str2.length()==0) {
			System.out.println("String lengh is 0");
			return;
		}
		if (Character.isDigit(str2.charAt(0))) {
			System.out.println("First char is Digit: " + str2.charAt(0));
		} else if (Character.isUpperCase(str2.charAt(0))) {
			System.out.println("First char is Uppercase: " + str2.charAt(0));
		} else if (Character.isLowerCase(str2.charAt(0))){
			System.out.println("First char is lowercase: " + str2.charAt(0));
		}
		
		//=======================
		
		
		String str = "journaldev";
		System.out.println("String length: " + str.length());
		
		//string to char array
		char[] chars = str.toCharArray();
		System.out.println(chars.length);
		
		//char at specific index
		char c = str.charAt(2);
		System.out.println(c);
		
		//Copy string characters to char array
		char[] chars1 = new char[7];
		str.getChars(0, 7, chars1, 0);
		System.out.println(chars1);
		
		char[] chars2 = new char[str.length()];
		str.getChars(0, str.length()-2, chars2, 2);
		System.out.println(chars2);
		
		char[] chars3 = new char[str.length()];
		str.getChars(7, str.length(), chars3, 4);
		System.out.println(chars3);

	}

}
