//		64. Initialize all elements of array with 0 (int a[5]={0,0,0,0,0}) & Perform following Programs.
//		a. Accept Value & Position & Store into an array at that Position.

package kanadeSir;

import java.util.Scanner;

public class Prob64_a {
	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner (System.in);
		int a[]= {0,0,0,0,0};
		System.out.println("enter value");
		int num=sc.nextInt();
		System.out.println("enter position");
		int p=sc.nextInt();
		for(i=0;i<a.length;i++) {
			if(i==p)
			a[i]=num;
		}
		for(i=0;i<4;i++)
			System.out.println(a[i]);
	}
	
	
	
}
