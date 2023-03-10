package kanadeSir;
import java.util.Scanner;
public class Prob42 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int rem;
		int add=0;
		while (num>0) {
			rem=num%10;
			add=add+rem;
			num=num/10;
		}
		System.out.println(add);
		

	}

}
