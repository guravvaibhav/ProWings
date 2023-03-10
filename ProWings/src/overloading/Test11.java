package overloading;

abstract class Parent {

	void m() {
		System.out.println("Parent");
	}
}


public class Test11 extends Parent{
	Test11(){
		super.m();					// way 1
	}
	{
		super.m();					// way 2
	}
	
	public static void main(String[] args) {
		Test11 p=new Test11();
	}
	 void m() {
		System.out.println("child");
		
	}

}
