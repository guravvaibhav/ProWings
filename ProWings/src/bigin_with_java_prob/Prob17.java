package bigin_with_java_prob;
import java.util.Scanner;
public class Prob17 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=100;
	int b;
	
	do {
		System.out.println("GUESS THE VALUE");
		b=sc.nextInt();
		if(b<a)
			System.out.println("TOO LOW");
		else if(b>a)
			System.out.println("TOO HIGH");
	}
	while(a!=b);
	System.out.println("****CONGRACTHULATIONS****");

	}

}
