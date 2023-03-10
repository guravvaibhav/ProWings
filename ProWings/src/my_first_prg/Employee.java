package my_first_prg;

import java.util.Scanner;

import kanadeSir.Prob10;

public class Employee extends Sallary{
	public static void main(String[] args) {
		Employee e=new Employee();
		e.get();
		int bsal=e.input();
		System.out.println("net sallary is: "+e.netSallary(bsal));
		e.put();
		e.output();
	}
}
class EmployeeData extends Prob10{
	int id;
	String nm;
	void get(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id number & name ");
	id=sc.nextInt();
	nm=sc.next();
	}
	void put() {
		System.out.println("employee id is : "+id+"\nname is: "+nm);
	}
}
class Sallary extends EmployeeData{
	int bsal;
	double nsal;
	int input() {
		Scanner sc= new Scanner (System.in); 
		System.out.println("enter basic sallary");	
		bsal=sc.nextInt();
		return bsal;
	}
	void output() {
		System.out.println("basic sallary is : "+bsal);
	}
}