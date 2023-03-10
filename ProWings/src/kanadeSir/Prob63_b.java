// 	b. Calculate Square of every element.

package kanadeSir;

import java.util.Scanner;

public class Prob63_b {
	public static void main(String[] args) {
		int a[] = new int[5];
		squareOfArray(a);

	}

	private static void squareOfArray(int[] a) {
		Scanner sc = new Scanner(System.in);
		int i;
		int squ;
		for (i = 0; i < a.length; i++) {
			System.out.println("enter value");
			a[i] = sc.nextInt();
			squ = a[i] * a[i];
			System.out.println("square of " + a[i] + " is " + squ);
		}
	}

}
