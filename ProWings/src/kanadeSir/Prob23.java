package kanadeSir;
import java.util.Scanner;
public class Prob23 {

	public static void main(String[] args) {
		Scanner  sc=new Scanner (System.in);
		System.out.println("enter 1st value");
		int x=sc.nextInt();
		System.out.println("enter opration = add/sub/mul/div/module");
		String operation=sc.next();
		System.out.println("enter 2nd value");
		int y=sc.nextInt();
	
		
		switch (operation) {
		case "add":
			System.out.println("result is : "+(x+y));
			break;
		case "sub":
			System.out.println("result is : "+(x-y));
			break;
		case "mul":
			System.out.println("result is : "+(x*y));
			break;
		case "div":
			System.out.println("result is : "+(x/y));
			break;
		case "module":
			System.out.println("result is : "+(x%y));
			break;
		default:
			System.out.println("illeagle operation");
		
			
		}
	
		

	}

}
