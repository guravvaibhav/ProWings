package overloading;

public class SingletonDemo1 {
	private static SingletonDemo1 t=null;				//private static field
	
	
	private SingletonDemo1() {							//private constructor
		super();
	}


	public static SingletonDemo1 getSingletonDemo1() {	// factory method public static
		if(t==null)
			t=new SingletonDemo1();
		return t;
	}

}
