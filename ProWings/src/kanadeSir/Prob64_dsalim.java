package kanadeSir;

import java.util.Scanner;

public class Prob64_dsalim {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value");
		int num=sc.nextInt();
		int a[]= {0,0,0,0,0};
		int i;
		
		for(i=4;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=num;
		for(i=0;i<a.length;i++)
				System.out.println(a[i]);
	}
}
