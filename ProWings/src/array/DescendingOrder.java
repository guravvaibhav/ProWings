package array;

import java.util.Scanner;

public class DescendingOrder {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int [] a=new int [5];
	for(int i=0;i<a.length;i++) {
		System.out.println("enter value");
		a[i]=sc.nextInt();
	}
	a=descendingOrder(a);
	for(int n:a)
	System.out.println(n);
}

private static int[] descendingOrder(int[] a) {
	int t;
	for(int j=1;j<a.length;j++) {
		for(int k=1;k<a.length;k++) {
			if(a[k]>a[k-1]) {
				t=a[k];
				a[k]=a[k-1];
				a[k-1]=t;
			}
		}
	}
	return a;
}
}
