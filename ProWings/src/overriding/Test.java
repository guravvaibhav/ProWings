package overriding;


class A{
	int i=79;
	static int j=56;
	void m1() {
		System.out.println(i);
	}
}
class B extends A{
	int i=25;
	
	static  void m2() {
		System.out.println("model");
	}
	static int j=34;
	static {
		m2();  //model
	System.out.println(j); //34
	}
	
}
public  class Test {
	public static  void main(String[] args) {
//   A a= new B();
//	System.out.println(a.i);  //79
//	System.out.println(a.j);  //56
//      a.m1();  //79
//	
		}
	
	
	
}
	

