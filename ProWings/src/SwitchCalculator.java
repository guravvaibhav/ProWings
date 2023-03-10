import java.util.Scanner;
public class SwitchCalculator {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int nm1,nm2;
		String operation;
		System.out.println("ENTER TWO VAUES ON WHICH YOU ARE DOING OPERATION ");
		nm1=sc.nextInt();
		nm2=sc.nextInt();
		System.out.println("ENTER WHICH OPERATION DO YOU WANT TO PERFORM");
		operation=sc.next();
		
		switch(operation)
		{
		case "addition":
			System.out.println("ADDITION OF TWO NUMBERS IS  "+(nm1+nm2));	
		break;
		case "subtraction":
			System.out.println("SUBTRACTION OF TWO NUMBERS IS  "+(nm1-nm2));	
		break;
		case "multification":
			System.out.println("MULTIFICATION OF TWO NUMBERS IS  "+(nm1*nm2));	
		break;
		case "division":
			System.out.println("DIVISION OF TWO NUMBERS IS  "+(nm1/nm2));	
		break;
		default:
			System.out.println("OPERATION NOT FOUND");
		}
	}

}
