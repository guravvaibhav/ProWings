package kanadeSir;
import  java.util.Scanner;
public class Prob48 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any value");
		int num=sc.nextInt();
		int num1=num;
		int rev=0;
		
		
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(num1==rev)
			System.out.println(num1+" is palindrome");
		else
			System.out.println(num1+" is not palindrome");

	}

}
