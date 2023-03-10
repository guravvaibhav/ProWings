package kanadeSir;
import java.util.Scanner;
public class Prob22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age,driving experience & 12th marks");
		int age=sc.nextInt();
		int exp=sc.nextInt();
		int marks=sc.nextInt();
		
		
		if(age>=40&&age>=10&&marks>=60)
			System.out.println("you are eligible");
		else
			System.out.println("you are not eligible");

	}

}
