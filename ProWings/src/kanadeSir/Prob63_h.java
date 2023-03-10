//	h. Accept a value & Search into an array & Display it is Present or Not also Position of value.


package kanadeSir;

import java.util.Scanner;

public class Prob63_h {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,c=0;
		int a[]= {2,2,6,87,4};
		System.out.println("enter search value");
		int num=sc.nextInt();
		for(i=0;i<a.length;i++) {
			if(a[i]==num) {
				System.out.println(num+" is present at index "+i+" of an array");
				c++;
			}
			
			}
		if(c==0) {
			System.out.println("search value not present in array");
		}
	}

}
