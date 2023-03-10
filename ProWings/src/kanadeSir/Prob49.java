package kanadeSir;
import java.util.Scanner;
public class Prob49 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int num1=num;
		int amn=0;
		int rem=0;
		for(int i=1;i>num;i++)
		{
			rem=num%10;
			//for()
			rem=rem*rem;
			num=num/10;
		}
		
		//not ok
		while(num>0) {
			int rem1=num%10;
			amn=amn+(rem1*rem1*rem1);
			num=num/10;
		}
		
			if(num1==amn)
				System.out.println(num1+" is armstrong number");
			else
				System.out.println(num1+" is not armstrong number");

	}

}
