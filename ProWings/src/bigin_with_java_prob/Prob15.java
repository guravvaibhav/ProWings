package bigin_with_java_prob;
import java.util.Scanner;
public class Prob15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		double res=0;
		double n=sc.nextDouble();
		for(double i=1;i<=n;i++) {
			res=res+(1/i);
		}
		System.out.println(res);
	}

}
