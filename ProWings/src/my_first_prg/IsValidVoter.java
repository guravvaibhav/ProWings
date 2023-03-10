package my_first_prg;
import java.util.Scanner;
public class IsValidVoter {
	

	

		public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter nationality");
		String nationality=sc.next();
		if(isValidVoter(age) && isIndian(nationality)) 
			System.out.println("you are eligible");
		else
			System.out.println("your not eligible");	
			
	}

		public static boolean isValidVoter(int age) {
		if(age>=18)
		return true;
		else
			return false;
		}

		public static boolean isIndian(String nationality) {
			if(nationality.equalsIgnoreCase("indian"))
			return true;
			else
				return false;
		}
	}

