package kanadeSir;

import java.util.Scanner;

public class If_else_ByMethodCalling {

	public static void main(String[] args) {
		If_else_ByMethodCalling m1=new If_else_ByMethodCalling();
		
		
	Scanner sc=new Scanner (System.in);
	System.out.println("enter age");
	int age=sc.nextInt();
	System.out.println("enter nationality");
	String nationality=sc.next();
	if(m1.isValidVoter(age) && m1.isIndian(nationality))     //method calling..!!
		System.out.println("you are eligible");
	else
		System.out.println("your not eligible");	
		
}

	public  boolean isValidVoter(int age) {
		
	if(age>=18)
	return true;
	else
		return false;
	}

	public  boolean isIndian(String nationality) {
		if(nationality.equalsIgnoreCase("indian"))
		return true;
		else
			return false;
	}
}