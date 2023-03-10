package typeCasting;
class X{
	void m(X a) {
		System.out.println("X");     
    }
}
class Y extends X{
	void m(Y b) {
		System.out.println("Y");
	}
}
public class Test2 {
	public static void main(String[] args) {
		X x= new X();
		X x1=new Y();
		Y x3=new Z();
		((Z)x3).m(x1);  //X
		((Z)x).m(x);    
		((Z)x1).m(x3);   
	}
}
class Z extends Y{
	void m(Z c) {
		System.out.println("Z");
	}
}

