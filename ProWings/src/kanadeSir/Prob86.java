package kanadeSir;

import java.util.Scanner;

// 86. Accept a character & Display how many times Repeated into the String.
public class Prob86 {
	public static void main(String[] args) {
	String s="maharashtra";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter char to find occurance");
	char find=sc.next().charAt(0);
	char []ch=s.toCharArray();
	int count=0;
	for(int i=0;i<ch.length;i++) {
		if(ch[i]==find)
			count++;
	}
	System.out.println("coourance of ("+find+") is :- "+count);
	
	
	}
	

}
