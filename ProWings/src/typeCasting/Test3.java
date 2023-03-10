package typeCasting;
class Q{
	void m(E e) {
		System.out.println("Q");
	}
}
public class Test3 {
	public static void main(String[] args) {
		Q q=new E();
		E e=new E();
	 q.m(null);   //Q
		q.m(e);      //Q
	 //q.m(q);      
		((E)q).m(q);   //W
	 e.m(q);      //W
	}
}
class W extends Q{
	void m(Q q) {
		System.out.println("W");
	}
}
class E extends W{
	void m(W w) {
		System.out.println("E");
	}
}