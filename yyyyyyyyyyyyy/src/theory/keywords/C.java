package theory.keywords;

/*Change the output to console from  "|0 null||0 null|" to  
 * "default constructor is invoked
 *  default constructor is invoked
 *  |1 c1||2 c2|"
 *  by change the parameterized Constructor - use keyword*/

@SuppressWarnings("all")
public class C {
	
	int id;
	String word;
	
	C(){
		System.out.println("default constructor is invoked");
	}
	
	C(int id, String word){
		
		id = id;
		word = word;
	}
	
	void display(){System.out.print("|" + id + " " + word + "|");}
	
	public static void main(String[] args) {
		C c1 = new C(1, "c1");
		C c2 = new C(2, "c2");
		c1.display();
		c2.display();
	}
}
