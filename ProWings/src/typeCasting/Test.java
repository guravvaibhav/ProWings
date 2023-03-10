package typeCasting;
class A{
	int i=10;
}
class B extends A{
	int i=20;
}
class C extends B{
	int i=30;
}
public class Test {
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.i);
		System.out.println(((C)a).i);
// 		example for class cast exception
// 		here a holds object A and (((C)a).i);in this 
//		we are triying to store Parent object(a)
//		in chaild(C) hence class cast exception...
	}

}
