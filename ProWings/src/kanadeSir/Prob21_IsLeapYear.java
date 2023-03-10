package kanadeSir;
import java.util.Scanner;
public class Prob21_IsLeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int year=sc.nextInt();
		if(year%4==0&&year%100!=0||year%400==0)
			System.out.println(year+" is leap year");
		else
			System.out.println(year+" is not a leap year");
	}

}
