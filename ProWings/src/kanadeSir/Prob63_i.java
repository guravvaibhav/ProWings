//	i. Search value into an array & Replace this value with 99.

package kanadeSir;

import java.util.Scanner;

public class Prob63_i {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a[]= {7,8,65,4,5};
		int i;
		System.out.println("enter search value");
		int num=sc.nextInt();
		for(i=0;i<a.length;i++) {
			if(a[i]==num) {
				a[i]=99;
			}
					
																																		
		}
		System.out.println("new array is");
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println();
	}

}
