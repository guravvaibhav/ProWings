package kanadeSir;

import java.util.Scanner;

// 85. Accept a Single character & Find into String.

public class Prob85 {
	public static void main(String[] args) {
		String s="maharashtra";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character to find");
		char c=sc.next().charAt(0);
		System.out.println(s.indexOf(c));
		
	}

}
