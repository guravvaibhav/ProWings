package overriding;

public class Test1 {
	int i=10;
	 String s="ram";
	public Test1(int i, String s) {
		this.i=i;
		this.s=s;
		
	}
	

	public static void main(String[] args) {
		
	final Test1 t=new Test1(50,"sham");
		
		System.out.println(t.i);
		System.out.println(t.s);
		t.i=234;
		t.s="dwk";
		
		System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<");
		System.out.println(t.i);
		System.out.println(t.s);
		System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<");

	Test1 t2=new Test1(100,"abc");
//		t=t2;
		System.out.println(t.i);
		System.out.println(t.s);
		System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<");
		System.out.println(t2.i);
		System.out.println(t2.s);
}
}
