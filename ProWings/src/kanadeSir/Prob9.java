package kanadeSir;

import java.util.Scanner;
public class Prob9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lone amount");
		int lamt=sc.nextInt();
		double iamt=lamt*0.12;
		System.out.println("interest amount is "+iamt);
		double tamt=lamt+iamt;
		System.out.println("total amount is "+tamt);
	
		
	}

}
