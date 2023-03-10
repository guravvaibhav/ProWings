package kanadeSir;
import java.util.Scanner;

public class Prob3 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter marks of five sub");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int e=sc.nextInt();
	
	int total=a+b+c+d+e;
	System.out.println("total is "+total);
	int avg=total/5;
	System.out.println("average is "+avg);
	
}
}
