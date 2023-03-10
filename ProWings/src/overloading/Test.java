package overloading;
class  P{
	void m(int i) {
		System.out.println("method m1");
	}
	void m1(int i,long l) {
		System.out.println("method m2");
	}

}
// edited*****


class AA extends P{
	void m(int i) {
		System.out.println("method m1 of AA");
	}
	void m1(int i,long l) {
		System.out.println("method m2");
	}
	public void m1(int i) {
		// TODO Auto-generated method stub
		
	}
}
public class Test {
	public static void main(String[] args) {
		AA a=new AA();
		a.m(10);
		

}
}