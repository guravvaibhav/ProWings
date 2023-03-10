package my_first_prg;

import java.util.Scanner;

public class Test extends Std {
	int m1,m2,m3;
	void input() {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter marks of 3 subjects");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}
	void output() {
		System.out.println("marks of m1 is : "+m1);
		System.out.println("marks of m2 is : "+m2);
		System.out.println("marks of m3 is : "+m3);
	}

}
