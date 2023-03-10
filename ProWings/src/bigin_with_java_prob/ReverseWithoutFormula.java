package bigin_with_java_prob;
import java.util.Scanner;
public class ReverseWithoutFormula {

	public static void main(String[] args) {
		int rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int num=sc.nextInt();
		int rev=0;
		//int num2=num;
		
		for(int i=1;num!=0;i++)
		{
			rem=num%10;
			System.out.print(rem);
			//rev=rev*10+rem;
			num=num/10;
		}
		//System.out.println(rev);
		//if (num2==rev)
		//	System.out.println("num is pelendrom");
		System.out.println();

	}

}
