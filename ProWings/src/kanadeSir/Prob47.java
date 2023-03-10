package kanadeSir;

import java.util.Scanner;

public class Prob47 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter any value");
	int num=sc.nextInt();
	int rem;
	while(num>0) {
		rem=num%10;
		if(rem>=0&&rem<=5)
			System.out.println(rem+" digits between 0 to 5");
		else
			System.out.println(rem+" digits between 6 to 9");
		num=num/10;
	}
	
}
}
