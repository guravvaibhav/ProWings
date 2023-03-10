package kanadeSir;

import java.util.Scanner;

// 76. Accept Single Character from user then Display on to the screen
public class Prob76 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any charactor");
		char c=sc.next().charAt(0);
		System.out.println(c);
	}

}

