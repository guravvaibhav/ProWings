package kanadeSir;
import java.util.Scanner; 
public class Prob41 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++) {
			System.out.println("enter number");
			int a=sc.nextInt();
			if(a<0)
				System.out.println(a+" is negative");
			else if(a>0)
				System.out.println(a+" is positive");
			else
				System.out.println(a+" is zero");
		}

	}

}
