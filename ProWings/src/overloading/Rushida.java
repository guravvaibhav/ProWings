package overloading;

class R {
	void m1(int i) {
		System.out.println("one");
	}
}
class U extends R{
	void m1(String i) {
		System.out.println("two");
	}
}

public class Rushida {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		U r = new U();
		r.m1("ram");
	}

}
