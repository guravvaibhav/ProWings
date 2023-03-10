package classoops;

interface inter100{
	void m1();
	void m2();
	void m3();
	void m4();
}

abstract class P implements inter100{
	public void m1() {
		System.out.println("method 1 in class A");
	}
	public void m2() {
		System.out.println("method 2 in class A");
	}
}
interface Q extends inter100{
	
}

class D extends P implements Q{
	public void m3() {																//we cant change return type bcoz we have to follow contract
		System.out.println("method 3 in class D");
	}
	public void m4() {
		System.out.println("method 4 in class D");
	}
}
public class Test10{
	public static void main(String[] args) {
		inter100 d=new D();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
	}
	
}
