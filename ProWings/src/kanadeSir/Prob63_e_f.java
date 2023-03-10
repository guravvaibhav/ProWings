//	e. Display negative & positive values.
//	f. Count negative & positive Numbers.

package kanadeSir;

import java.util.Scanner;

public class Prob63_e_f {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int i, cp = 0, cn = 0;
		for (i = 0; i < a.length; i++) {
			System.out.println("enter value");
			a[i] = sc.nextInt();
			if (a[i] < 0) {
				System.out.println(a[i] + " is negative ");
				cn++;
			} else {
				System.out.println(a[i] + " is positive");
				cp++;
			}
		}
		System.out.println("total positive numbers are : " + cp);
		System.out.println("total negative numbers are : " + cn);
	}
}
