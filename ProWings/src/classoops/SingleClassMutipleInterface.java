package classoops;

class Abc implements A,B{
	public void m1() {
		System.out.println("method 1");
	}
	public void m2() {
		System.out.println("method 2");
	}
	public void m3() {
		System.out.println("method 3");
	}
	public void m4() {
		System.out.println("method 4");
	}
}
interface A{
	void m2();
	void m4();
}
interface B{
	void m1();
	void m3();
}

public class SingleClassMutipleInterface {
	public static void main(String[] args) {
		A a=new Abc();
		a.m2();
		a.m4();
		B b=new Abc();
		b.m1();
		b.m3();
	}

}
