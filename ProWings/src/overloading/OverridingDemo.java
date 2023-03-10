package overloading;
import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

class OverridingDemoParent
{
	
	public void m1(int i) 
	{
		System.out.println("inside m1 of OverridingDemoParent");
	}
	
}

public class OverridingDemo extends OverridingDemoParent{
	
	public void m1(long j) 
	{
		System.out.println("inside m1 of OverridingDemo child");
	}

	
	public static void main(String[] args) throws IOException {
		
		
		OverridingDemoParent obj1 = new OverridingDemoParent();
		obj1.m1(10);
		OverridingDemo obj4 = new OverridingDemo();
		obj4.m1(20);
		OverridingDemoParent obj2 = new OverridingDemo();
		obj2.m1(30);
		
//		OverridingDemo obj3 = new OverridingDemoParent();
		
		
		
	}

}