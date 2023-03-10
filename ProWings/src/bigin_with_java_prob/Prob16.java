package bigin_with_java_prob;
import java.util.Scanner;
public class Prob16 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	double n=sc.nextDouble();
	double res=0;
	for(double i=1;i<=n;i++) {
		res=res-(1/i);
	}
	System.out.println(res);
	}

}
