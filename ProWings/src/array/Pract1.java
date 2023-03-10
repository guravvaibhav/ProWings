// Q) define an array  having 5 elements,store values in to it and then display on the screen.

package array;

import java.util.Scanner;

public class Pract1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int i;
		for(i=0;i<=4;i++)
		{
			System.out.println("enter value");
			a[i]=sc.nextInt();
		}
		System.out.println("array values are: ");
		for(i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
	}

}
