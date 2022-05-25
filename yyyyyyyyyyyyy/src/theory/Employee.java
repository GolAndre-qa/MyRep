package theory;

/*Change the output to console from "programmer" to "employee - programmer" using Inheritance */

class Employee {
	
	Employee(){
		System.out.print("employee - ");
	}
	
}

class Programmer {
	
	
	public Programmer() {
		
		System.out.println("programmer");
	}
	
	public static void main(String[] args) {
		Programmer p = new Programmer();
	}
	
}