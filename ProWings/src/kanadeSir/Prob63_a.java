// 63. Create an array having 5 elements store values into it & Perform following programs.
// a. Display all elements in Reverse order.

package kanadeSir;

import java.util.Scanner;

public class Prob63_a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int[] a = acceptValuesInArray(sc);
		prinValuesOfArray(a);
	}

	private static int[] acceptValuesInArray(Scanner sc) {
		int a[] = new int[5];
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.println("enter value");
			a[i] = sc.nextInt();

		}
		return a;
	}

	private static void prinValuesOfArray(int[] a) {
		int i;
		System.out.println("reverse values of array are");
		for (i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
}
