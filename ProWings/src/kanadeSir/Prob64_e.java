package kanadeSir;

import java.util.Scanner;

public class Prob64_e {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 90, 36, 85, 93, 28 };
		System.out.println("enter two values you want to swap");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int i;
		int ln1 = 0, ln2 = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] == n1) 
				ln1 = i;
			if (a[i] == n2) 
				ln2 = i;
		}
		if(ln1!=0&&ln2!=0) {
		a[ln1]=n2;
		a[ln2]=n1;
		}
		for (int n : a) {
			System.out.println(n);
		}
	}
}
