// 61. Take input values if input value is negative do not accept this value But compulsory accept (store) 10 values.
package kanadeSir;

import java.util.Scanner;

public class Prob61 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=1,num;
		while(n<=10) {
			System.out.println("enter value");
			num=sc.nextInt();
		if(num<0)
			continue;
		System.out.println(num);
		n++;
		}
	}

}
