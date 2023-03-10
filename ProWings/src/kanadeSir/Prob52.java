package kanadeSir;

import java.util.Scanner;

public class Prob52 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+"\n"+b);
		int c=0;
		for(int i=1;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}

}
