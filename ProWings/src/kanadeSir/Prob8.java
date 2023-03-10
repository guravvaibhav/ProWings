package kanadeSir;
import java.util.Scanner;
public class Prob8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter bill amount");
		int ba=sc.nextInt();
		double gstamt=0.18*ba;
		System.out.println("gst amounrt is "+gstamt);
		double namt=ba+gstamt;
		System.out.println("net amounrt is "+namt);
	}

}
