package kanadeSir;
import java.util.Scanner;
public class Prob51 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values of x & y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int res=1;
		for(int i=1;i<=y;i++) {
			res=res*x;
		}
System.out.println(res);
	}

}
