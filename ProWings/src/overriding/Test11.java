package overriding;

public class Test11 {

	static void m1(int... i) {
		System.out.println("one");
	}

//	static void m1(int []k) {
//		System.out.println("two");
//	}


	public static void main(String[] args) {
		
		m1(3);
	}
}
