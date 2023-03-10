package overloading;


public class Test3 {
	public static void main(String[] args) {
Test3 t=new Test3();	
   			byte l=78;
//		 t.m1(null);
	
		
		
		
}
	public void m1(Boolean n) {
		System.out.println("Object");
	}
	public void m1(Short n) {
		System.out.println("String");
	}
	public void m1(Number s) {
		System.out.println("number");
	}
	public void m1(char s) {
		System.out.println("float s");
	}
	
}
