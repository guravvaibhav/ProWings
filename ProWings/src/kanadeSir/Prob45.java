package kanadeSir;
import java.util.Scanner;
public class Prob45 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int large=0;
		int small=0;
		char b;
		
		
		if(num1<num2) {
			small=num1;
			large=num2;	
		}
		else if(num1>num2) {
			small=num2;
			large=num1;
		}
		else if(num1==num2) {
			small=num1;
			large=num1;
		}
		System.out.println("do you want enter another number? type y/n");
		char a=sc.next().charAt(0);
				
		if(a=='y') {
			do {
			System.out.println("enter number");
			int num3=sc.nextInt();
			if(num3>large)
				large=num3;
			else if(num3<small)
				small=num3;
			System.out.println("do you want to enter another number? y/n");
			b=sc.next().charAt(0);
			}
			while(b=='y');	
		}
		System.out.println("larger number is "+large);
		System.out.println("smaller number is "+small);
		

	}

}
