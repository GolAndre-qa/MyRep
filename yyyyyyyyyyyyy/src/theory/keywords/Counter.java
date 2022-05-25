package theory.keywords;

/*Change the output to console from "111" to "123" by adding only one word (keyword) to code*/

public class Counter {
	
	int count = 0;
	
	public Counter() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}
	
}
