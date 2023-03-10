// Q) Calculate addition of all elements.

package array;

import java.util.Scanner;

public class Pract3 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int [5];
	int i;
	int add=0;
	for(i=0;i<=4;i++)
	{
		System.out.println("enter value");
		a[i]=sc.nextInt();
		add=add+a[i];
	}
	System.out.println("addition of all elements is: "+add);
	
	}
}
