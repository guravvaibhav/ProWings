package kanadeSir;
import java.util.Scanner;
public class Prob17 {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter marks");
		int m=sc.nextInt();
		if(m<40)
			System.out.println("you are fail");
		else
			System.out.println("you are pass");

	}

}
