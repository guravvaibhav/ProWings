package passingObjectAsParameter;
import java.util.Scanner;
class BankN {
	String nm;
	int acno;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name & account number");
		nm = sc.next();
		acno = sc.nextInt();
	}
	void show() {
		System.out.println(nm);
		System.out.println(acno);
	}
	BankN Analysis(BankN x) {
		x.nm = "sham";
		x.acno = 567;
		return x;
	}
}
public class POP {
	public static void main(String[] args) {
		BankN b = new BankN();
		b.input();
		b.show();
		System.out.println("<<<<<<>>>>>>");
		BankN c = new BankN();
		c = c.Analysis(c);
		c.show();
	}
}
