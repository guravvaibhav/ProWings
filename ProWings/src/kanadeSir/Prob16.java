package kanadeSir;
import java.util.Scanner;
public class Prob16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("entertwo values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<b) {
			System.out.println(a+" is smaller number");
			System.out.println(b+" is larger number");
		}
		else if (a>b) {
			System.out.println(b+" is smaller number");
			System.out.println(a+" is larger number");
		}
		else
			System.out.println(a+" is equal to "+b);
	}

}

