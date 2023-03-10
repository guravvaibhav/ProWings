// 	g. Find Value that have in between 80 & 90.

package kanadeSir;

import java.util.Scanner;

public class Prob63_g {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int a[]=new int [5];
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println("enter value");
			a[i]=sc.nextInt();
			if(a[i]>=80&&a[i]<=90) {
				System.out.println(a[i]);
			}
		}
	}

}
