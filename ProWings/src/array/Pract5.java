
//  Q) calculate square of every element.
package array;

import java.util.Scanner;

public class Pract5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a[]=new int [5];
		int i;
		int squ=0;
		for(i=0;i<=4;i++) {
			System.out.println("enter value");
			a[i]=sc.nextInt();
			squ=a[i]*a[i];
			System.out.println("square of "+a[i]+" is : "+squ);
		}
		
	}
}
