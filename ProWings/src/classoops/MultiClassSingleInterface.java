package classoops;

class W implements Sham{
	public void m1() {
		System.out.println("method 1 in W class");
	}
	public void m2() {
		System.out.println("method 2 in W class");
	}
	public void m3() {}
	public void m5() {}
}
class X implements Sham{
	public void m3() {
		System.out.println("method 3 in X class");
	}
	public void m4() {
		System.out.println("method 4 in X class");
	}
	public void m1() {}
	public void m5() {}
}
class Y implements Sham{
	public void m5() {
		System.out.println("method 5 in Y class");
	}
	public void m6() {
		System.out.println("method 6 in Y class");
	}
	public void m1() {}
	public void m3() {}
}
interface Sham{
	public void m1();
	public void m3();
	public void m5();
}

public class MultiClassSingleInterface {
	public static void main(String[] args) {
		
		Sham s=new W();
		s.m1();
		s.m3();
		s=new X();
		s.m3();
		s=new Y();
		s.m5();
	}
}


