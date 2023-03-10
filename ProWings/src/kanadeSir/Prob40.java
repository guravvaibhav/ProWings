package kanadeSir;
import java.util.Scanner;
public class Prob40 {

	public static void main(String[] args) {
		int a=1;
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter value");
		int f=sc.nextInt();
		for(int i=f;i>=1;i--)
			a=a*i;
		System.out.println("factorial of "+f+" is "+a);
	}

}
