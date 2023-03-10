package kanadeSir;
import java.util.Scanner;
public class Prob64_dsnew {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 0, 0, 0, 0, 0 };
		int i;
		char y;
		do {
			System.out.println("enter value");
			int num = sc.nextInt();

			for (i = 4; i > 0; i--) {
				a[i] = a[i - 1];
			}
			a[0] = num;
			System.out.println("do you want to enter another value?? y/n ");
			y = sc.next().charAt(0);
		}
		while (y=='y');
		for (i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
