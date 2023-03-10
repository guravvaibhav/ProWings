package kanadeSir;

import java.util.Scanner;

public class Prob54 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any value");
		int num=sc.nextInt();
		int res=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				res=res+i;
			}
		}
			if (res==num)
				System.out.println(num+" is exact number");
			else
				System.out.println(num+" is not exact number");

	}

}
