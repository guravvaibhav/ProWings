package kanadeSir;
import java.util.Scanner;
public class Prob53 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int count=0;
		if(num!=0) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
			count++;
			
		}
		if(count==0)
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not not a prime number");
	}
		else
			System.out.println(num+" is nigther prime not composite number");
	}
	

}
