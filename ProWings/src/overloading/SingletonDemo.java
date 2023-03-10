package overloading;   				/// Aproch 1

public class SingletonDemo {
	private static SingletonDemo t=new SingletonDemo();
	
	private SingletonDemo(){
		
	}
	public static SingletonDemo getSingletonDemo() {
		return t;
	}
}
