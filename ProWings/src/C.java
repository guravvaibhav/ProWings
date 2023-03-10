
 class p {
void m1(int...x) {
	System.out.println("var arg");
}
}
public class C extends p{
	void m1(int[] x ) {
		System.out.println("[]");
	}
	public static void main(String[] args) {
		int []y= {1,2,34};
		p p=new p();
		p.m1(y);
	}
}

