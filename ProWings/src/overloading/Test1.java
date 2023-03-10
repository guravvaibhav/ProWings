package overloading;
class Ab{
	void m1(long i) {
		System.out.println("parent");
	}
}
class Bb extends Ab{	
	void m1(double d) {
		System.out.println("child");
	}
}

public class Test1 {
	public static void main(String[] args) {
		Bb a=new Bb();
		a.m1(90);
//		System.out.println(null);
	}
}
