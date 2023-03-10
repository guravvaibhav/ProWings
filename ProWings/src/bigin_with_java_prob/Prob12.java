package bigin_with_java_prob;
import java.util.Scanner;
public class Prob12 {

	public static void main(String[] args) {
		char z=0;
		Scanner sc=new Scanner(System.in);
		int small=0;
		int large=0;
		int x;
		
		System.out.println("enter any two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
	
		if(a<=b) {
			small=a;
			large=b;
			}
		else if(a>b) {
			small=b;
			large=a;
		}
			
		System.out.println("Do you want to enter another number then press y if not press another key");
		char d=sc.next().charAt(0);
		if(d!='y') {
			System.out.println("smaller number is :- " +small);
			System.out.println("larger number is :- " +large);
		}
		else {
			do {
				System.out.println("enter new number");
			x=sc.nextInt();
		
		if(x<small)
			small=x;
		else if(x>large)
			large=x;
		System.out.println("Do you want to enter another number then press y if not press another key");
		z=sc.next().charAt(0);
			}
		while(z=='y');
		System.out.println("smaller number is :- " +small);
		System.out.println("larger number is :- " +large);
		
		}
	}

}
