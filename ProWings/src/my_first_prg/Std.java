package my_first_prg;

import java.util.Scanner;

public class Std {
int roll;
String nm;
 void get() {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter roll number & name of the student");
	roll=sc.nextInt();
	nm=sc.next();
}
 void put(){
	System.out.println("roll number is: "+roll);
	System.out.println("name is : "+nm);
}
}
