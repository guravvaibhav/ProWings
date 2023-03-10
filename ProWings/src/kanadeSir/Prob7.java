package kanadeSir;
import java.util.Scanner;
public class Prob7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter base & height of the triangle");
		int b=sc.nextInt();
		int h=sc.nextInt();
		
		double a=0.5*b*h;
		System.out.println("area of triangle is"+a);

	}

}
