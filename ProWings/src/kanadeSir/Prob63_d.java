
//	d. Copy one array into another array.

package kanadeSir;

import java.util.Scanner;

public class Prob63_d {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a[]=new int [5];
		int b[]=new int [5];
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println("enter value");
			a[i]=sc.nextInt();

		}
		System.out.println("copy of a[]");
		
		for(i=0;i<a.length;i++) {
			b[i]=a[i];
			System.out.println(a[i]);
		}
	}

}
