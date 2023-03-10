package kanadeSir;
import java.util.Scanner;
public class Prob24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("bikes and there model numbers are :- ");
		System.out.println("hero Splender : 123");
		System.out.println("bajaj pulser 150 : 456");
		System.out.println("RTR apache 200 4V : 789");
		
		System.out.println("enter model number");
		int mn=sc.nextInt();
		
		switch(mn) {
		case 123:
			System.out.println("\n hiro splender :- \n\n company name : Hiro motors \n mileage : 57 to 81 km/l \n price : 57782 to 911964");
			break;
		case 456:
			System.out.println("\n bajaj pulser 150 :- \n\n company name : Bajaj motors \n mileage : 50 km/l \n price : 84504 to 140140");
			break;
		case 789:
			System.out.println("\n RTR aappache 200 4V :- \n\n company name : TVS motors \n mileage : 37 to 40 km/l \n price : 111047 to 180965");
			break;
		default :
			System.out.println("\n model not found");
		}

	}

}
