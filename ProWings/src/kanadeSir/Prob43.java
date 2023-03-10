package kanadeSir;
import java.util.Scanner;
public class Prob43 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=0320;//sc.nextInt();
		int count=0;
		
		while(num>0) {
			int rem=num%10;
			count++;
			num=num/10;
			//System.out.println("Hi");
		}
			System.out.println(count);

	}

}
