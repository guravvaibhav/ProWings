package kanadeSir;
import java.util.Scanner;
public class Prob46 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three digit value");
		int num=sc.nextInt();
		int add=0;
		int rev=0;
		int large=num%10;
		int small=num%10;
		int rem;
		System.out.println("digits are");
		while(num>0) {
			rem=num%10;
			System.out.println(rem);
				
			if(rem<small)
				small=rem;
			if(rem>large)
				large=rem;
			add=add+rem;
			rev=rev*10+rem;
			num=num/10;
		}
			System.out.println("\naddition of all digits is :"+add);	
			System.out.println("reverse number is :"+rev);
			System.out.println(small+" is smaller digit");
			System.out.println(large+" is larger digit");
			
			}
		
				
			
			
	}


