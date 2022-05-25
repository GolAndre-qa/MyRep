
public class test123 {

	@SuppressWarnings("finally")
	public int test() {
		
		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
	
	public static void main(String[] args) {
		test123 t = new test123();
		System.out.println(t.test());
	}
}
