package theory.keywords;

/*Change output to console from "|0 null||0 null|" to "|1 b1||2 b2|" by using keyword in body of constructor */

@SuppressWarnings("all")
public class B {
	
	int id;
	String word;
	
	B(int id, String word){
		id = id;
		word = word;
	}
	
	void display()  {
		System.out.print("|" + id + " " + word + "|");
	}
	
	public static void main(String[] args) {
		B b1 = new B(1,"b1");
		B b2 = new B(2, "b2");
		b1.display();
		b2.display();
	}
	
}
