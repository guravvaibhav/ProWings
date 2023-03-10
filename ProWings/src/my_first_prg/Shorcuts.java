package my_first_prg;

import java.util.Scanner;

public class Shorcuts {
	Scanner sd=new Scanner(System.in);
	int p;
	int q;
	 static int x;
	static int y;
	public static void main(String[] args) {

		System.out.println("main method started");
		
		Shorcuts s1 = new Shorcuts();
		int z=s1.p+s1.q;
		System.out.println("instance bloc result "+z);
		int result = s1.addition(x, y);
		System.out.println(result);
		System.out.println("main ended");
	}

	public final int addition(int a, int b) {
		System.out.println("addition started");
		int sum = a + b;
		System.out.println("addition started");
		return sum;
	}

	Shorcuts() {
		System.out.println("constructor calling");
	}

	{
		System.out.println("instance block");
		System.out.println("enter two values");
		p=sd.nextInt();
		q=sd.nextInt();
		
	}
	static {
		System.out.println("static block");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
	}

}
