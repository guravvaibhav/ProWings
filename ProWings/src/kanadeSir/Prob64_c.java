//	c. Store 5 values into an array & Move values to R.H.S. & Remove last value.

package kanadeSir;

import java.util.Scanner;

public class Prob64_c {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]= {0,0,0,0,0};
		int b[]=new int [5];
		int i,j=1;
		for(i=0;i<a.length;i++) {
			System.out.println("enter value");
			a[i]=sc.nextInt();
		}
		for(i=1;i<a.length;i++) {
			
			b[j]=a[i-1];
			j++;
			
		}
		b[0]=0;
		for(i=0;i<b.length;i++)
				System.out.println(b[i]);
	}
}
