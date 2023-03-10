// Q) count negative & positive values. 


package array;

import java.util.Scanner;

public class Pract6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a[]=new int [5];
		int i;
		int count_p=0,count_n=0;
		for(i=0;i<=4;i++){
			System.out.println("enter value");
			a[i]=sc.nextInt();
			if(a[i]<0) {
				System.out.println(a[i]+" is negative value");
				count_n++;
			}
			else {
				System.out.println(a[i]+" is positive value");
				count_p++;
			}
				
		}
		System.out.println
		("\n\ttotal positive values are : "+count_p);
		System.out.println("\n\ttotal negative values are : "+count_n);
	}
}
