package kanadeSir;
import java.util.Scanner;
public class Prob50 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a+"\n"+b);
		for(int i=0;i<=n;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
			

	}

}
