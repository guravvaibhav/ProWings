// Q)Display values in reverse.

package array;

import java.util.Scanner;

public class Pract2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		int i;
		for(i=0;i<=4;i++)
		{
			System.out.println("enter value");
			a[i]=sc.nextInt();
		}
		System.out.println("revers order values are");
		for(i=4;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
	}

}
