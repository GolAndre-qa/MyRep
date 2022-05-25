package theory;

class Compare{
	
	
	public static void main(String[] args) {
		
		
	//Question 1
		String s1 = new String ("abc");
		String s2 = new String ("abc");
		
		boolean exp1 = (s1 == s2);  //change expression (s1 == s2) for get value "true"
		
		System.out.println("RESULT 1: " + exp1);
		
	//Question 3
		
		String s3 = "abc"; //Why RESULT 3: is - true? What is difference between definition of the variables in this question 
		String s4 = "abc"; //and in question 1;
		
		boolean exp3 = (s3 == s4);
		
		System.out.println("RESULT 3: " + exp3); 
	}
	
}