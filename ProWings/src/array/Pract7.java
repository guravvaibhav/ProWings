// Q) Find maximum & minimum values from array. 


package array;

import java.util.Scanner;

public class Pract7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a[]=new  int[5];
		int i,max=0,min=0;
		
		for(i=0;i<=4;i++) {
			System.out.println("enter value");
			a[i]=sc.nextInt();
			if(i==0) {
			min=a[0];
			max=a[0];
			}
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("maximum value from array is : "+max);
		System.out.println("minimum value from array is : "+min);
	}
}
