package bigin_with_java_prob;
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int j=0;
		if(num==0||num==1)
			System.out.println("nigther prime nor composite number");	
		else {
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				j=j+1;
		}
		if(j>2) {
			System.out.println("not prime num");
		}
		else
			System.out.println("prime num");
		}
}
}
