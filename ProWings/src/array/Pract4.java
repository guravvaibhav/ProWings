//copy one array in to another array.

package array;

import java.util.Scanner;

public class Pract4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a[]=new int [5];
		int b[]=new int [5];
		int i;
		for(i=0;i<=4;i++)
		{
			System.out.println("enter value");
			a[i]=sc.nextInt();
		}
		System.out.println("copy of array a is");
		for(i=0;i<=4;i++) {
			b[i]=a[i];
			System.out.println(b[i]);
		}
		
		
	}

}
