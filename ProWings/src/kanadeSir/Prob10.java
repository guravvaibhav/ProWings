package kanadeSir;
import java.util.Scanner;
public class Prob10 {

	public static void main(String[] args) {
		char a;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter basic sallary");
		int bs=sc.nextInt();
		double ns=netSallary(bs);
		System.out.println("do you want to calculate sallary of another employee?? y/n ?");
		a=sc.next().charAt(0);
		}
		while(a=='y');
			
		
				
	}
public static double netSallary(int bs)
{
	double hra=bs*0.45;
	double ta=bs*0.25;
	double da=bs*0.30;
	double ma=bs*0.05;
	double pf=bs*0.25;
	
	double ns=bs+hra+ta+da-ma-pf;
	//System.out.println("net sallary is"+ns);
	return ns;
}
}
