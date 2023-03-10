package kanadeSir;
import java.util.Scanner;
public class Prob38 {

	public static void main(String[] args) {
		int x=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any value");
		int a=sc.nextInt();
		for(int i=a;i>=1;i--)
			x=x*i;
		System.out.println(x);
		
		
	}

}
