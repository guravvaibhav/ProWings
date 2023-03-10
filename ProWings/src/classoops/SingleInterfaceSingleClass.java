package classoops;

class Inter1 implements Inter{
	public void m1() {
		System.out.println("method 1");
	}
	public void m2() {
		System.out.println("method 2");
	}
}
interface Inter{
	void m1();
	void m2();
}
class SingleInterfaceSingleClass{
	public static void main(String[] args) {
		Inter i=new Inter1();
		i.m1();
	}
}