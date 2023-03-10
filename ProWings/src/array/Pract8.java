// Sort/arrange all values in ascending order.

package array;

import java.util.Scanner;

public class Pract8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a[]=new int[5];
		int i,max=0,min=0;
		for(i=0;i<=4;i++) {
			System.out.println("enter value");
			a[i]=sc.nextInt();
			if(i==0) {
				max=a[0];
				min=a[0];
			}
			if(a[i]<min)
				System.out.println(min);
		//	if(a[i]>min)
			
			
			
			
		}
	}

}
