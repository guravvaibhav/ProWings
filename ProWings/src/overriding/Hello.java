package overriding;

	interface H
	{
	    int x=10;
	}
	interface J
	{
	    int x=100;
	}
	class Hello implements H,J
	{
	    public static void Main(String args[])
	    {
	       /* reference to x is ambiguous both variables are x
	        * so we are using interface name to resolve the 
	        * variable
	        */
//	       System.out.println(x); 
	       System.out.println(H.x);
	       System.out.println(J.x);
	    }
	}

