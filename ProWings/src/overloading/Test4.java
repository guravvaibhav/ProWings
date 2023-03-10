package overloading;
class AW{
	{
		m1();
	}
	AW(){
		System.out.println("A constructor");
	}
	void m1() {
		System.out.println("A m1");
	}
}

public class Test4 extends AW{
	public static void main(String[] args) throws Exception {
		Test4 t=new Test4();
	}
	void m1() {
		System.out.println("Test4 m1");
	}
}
