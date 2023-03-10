//	c. Calculate Cube of every element & store into Second array.

package kanadeSir;

import java.util.Arrays;
import java.util.Scanner;

public class Prob63_c {
	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		cube(a, b);
		System.out.println("array of input values");
		System.out.println(Arrays.toString(a));
		//for(int n:a)
		//	System.out.print(n+" ");
		System.out.println("array of cube of input values");
		System.out.println(Arrays.toString(b));
		//for(int n:b)
		//	System.out.print(n+" ");
	}
	

	private static void cube(int[] a, int[] b) {
		Scanner sc=new Scanner(System.in);
		int i,cube,j=0;
		for(i=0;i<a.length;i++) {
			System.out.println("enter value");
			a[i]=sc.nextInt();
			cube=a[i]*a[i]*a[i];
			b[j]=cube;
			j++;
			//System.out.println("cube of "+a[i]+" is "+cube);
		}
	}

}
