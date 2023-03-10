package kanadeSir;

import java.util.Scanner;

public class Prob64_cn {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]= {0,0,0,0,0};
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println("enter value");
			a[i]=sc.nextInt();
		}
		for(i=4;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=0;
		for(i=0;i<a.length;i++)
				System.out.println(a[i]);
	}
}
