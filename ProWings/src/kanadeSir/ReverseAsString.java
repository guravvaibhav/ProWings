package kanadeSir;
import  java.util.Scanner;
public class ReverseAsString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any value : ");
		String num = sc.next();
				
		StringBuilder sb = new StringBuilder( num );  
	    sb.reverse();
	    
	    String num1 = "" + sb;
	    
	    System.out.print("\n\n\t Given number is " + num );
		System.out.print("\n\n\t After REVERSE,  number is " + sb );
	    
	    if( num1.equals(num1))
	    {
	    	System.out.println("\n\t Given Number is pallindrom");
	    }
	    else
	    {
	    	System.out.println("\n\t Given Number is NOTTTTTTTTTTTTTTTTTTTTT     pallindrom");
	    }
	    		
		int no = Integer.parseInt( num1 );
		System.out.println("\n\n\t Your number is " + no );
		
	
	}

}
