package kanadeSir;
import java.util.Scanner;
public class Prob15 {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter any value");
		int a=sc.nextInt();
		if(a>0)
			System.out.println(a+" is positive number");
		
		else if(a<0)
			System.out.println(a+" is negative number");
		else
			System.out.println(a+" is nigther positive nor negative");

	}

}
