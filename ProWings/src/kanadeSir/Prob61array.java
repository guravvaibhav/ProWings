// 61. Take input values if input value is negative do not accept this value But compulsory accept (store) 10 values.
package kanadeSir;

import java.util.Scanner;

public class Prob61array {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a[]=new int[10];
		int num;
		for(int i=0;i<a.length;i++) {
			System.out.println("enter value");
			num=sc.nextInt();
			if(num<0) {
				i--;
				continue;
			}
			a[i]=num;
		}
		for(int n:a)
			System.out.println(n);
		}
}
