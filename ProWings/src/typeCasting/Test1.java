package typeCasting;

class AA{
	void m(AA a) {
		System.out.println("AA");
	}
	
}
class AB extends AA{
	void m(AB b) {
		System.out.println("AB");
	}
}
class AC extends AB{
	void m(AC c) {
		System.out.println("AC");
	}
}
public class Test1 {
	public static void main(String[] args) {
	AA x=new AA();
	AB x1=new AB();
	AC x2=new AC();
	x.m(x2);   
	x1.m(x);	
	x2.m(x1);    
	
	}
}