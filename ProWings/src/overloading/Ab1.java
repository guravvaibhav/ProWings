package overloading;

public   class Ab1 {
	public static void main(String...args) {

		
	Ab1 ab=new Ab1();
	ab.m1("s");
	
	
}
	void m1(String s ) {
		System.out.println("string");
	}
void m1(StringBuffer s ) {
	System.out.println("stringbbbb");
	}
}