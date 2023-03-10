package kanadeSir;
import java.util.Scanner;
public class Prob13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values of x & y");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		/*int  xs=x*x;
		int yc=y*y*y;
		int x1=4*xs;
		int y1=5*yc;
		int add=x1+y1;
		int deno=2*x*y;
		int z=add/deno;
		*/double z=((4*(x*x)+(5*(y*y*y)))/(2*x*y));
		System.out.println(+z);
	}

}
