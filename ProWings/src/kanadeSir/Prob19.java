package kanadeSir;

import java.util.Scanner;

public class Prob19 {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter three values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		if(a>b&&a>c&&a>d)
			System.out.println(a+" is larger number");
		else if(b>a&&b>c&&b>d)
			System.out.println(b+" is larger number");
		else if(c>a&&c>b&&c>d)
			System.out.println(c+" is larger number");
		else
			System.out.println(d+" is larger number");
		

	}

}
