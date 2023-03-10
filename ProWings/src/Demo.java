class A{
	void m1()
{System.out.println("A");
		}
}
class B extends A{
	void m1()
	{System.out.println("B");
			}
}
public class Demo extends B{
	void m1()
	{System.out.println("Demo");
			}

	public static void main(String[] args) {
		A a=new A();
		a.m1();
		B b=(B)a;
		b.m1();
		Demo d=(Demo)b;
		d.m1();
		
		
	}
}
