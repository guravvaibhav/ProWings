package kanadeSir;
import java.util.Scanner;
public class Prob11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter any two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+"   b="+b);

	}

}
