package bigin_with_java_prob;
import java.util.Scanner;
public class Prob14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1;i<=n;i++) {
			
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
			
		
		

	}

}
