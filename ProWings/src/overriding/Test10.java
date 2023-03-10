package overriding;

public class Test10 {

	static void m1(int i, int j, Integer k) {
		System.out.println("one");
	}

	static void m1(Integer i, Integer j, int k) {
		System.out.println("two");
	}

	static void m1(Long i, Long k) {
		System.out.println("one");
	}

	static void m1(Float i, float j) {
		System.out.println("two");
	}

	public static void main(String[] args) {
//		m1(10, 10, 10);
//		m1(10, 10);
	}
}
