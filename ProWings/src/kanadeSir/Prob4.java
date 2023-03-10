package kanadeSir;

import java.util.Scanner;
public class Prob4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length,breadth & height of the box");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		
		int v=l*b*h;
		System.out.println("volume of the box is "+v);

	}

}
