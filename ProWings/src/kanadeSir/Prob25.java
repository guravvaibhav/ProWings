package kanadeSir;
import java.util.Scanner;
public class Prob25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter city name");
		String city=sc.next();
		switch(city) {
		case "kolhapur":
			System.out.println("\nAREA OF CITY in km square : 66.82\nPOPULATION OF CITY : 635405\nREGION : SOUTHWESTERN MAHARASHTRA");
			break;
		case "nagpur":
			System.out.println("\nAREA OF CITY in km square : 393.5\nPOPULATION OF CITY : 2940000\nREGION : VIDARBHA, MAHARASHTRA");
			break;
		case "amravati":
			System.out.println("\nAREA OF CITY in km square : 70.8\nPOPULATION OF CITY : 778087\nREGION : VIDARBHA, MAHARASHTRA");
			break;
		default:
			System.out.println("data not found");
			
		}

	}

}
