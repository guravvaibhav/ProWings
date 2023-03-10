//	b. Store 5 values Accept values & position.

package kanadeSir;

import java.util.Scanner;

public class Prob64_b {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]= {0,0,0,0,0};
		int i;
		for(i=0;i<a.length;i++) {
		System.out.println("enter value");
		int num=sc.nextInt();
		System.out.println("enter position");
		int p=sc.nextInt();
		a[p]=num;
		}
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
