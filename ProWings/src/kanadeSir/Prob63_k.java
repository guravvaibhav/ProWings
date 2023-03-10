//	k. Search value into an array & Delete this value. & put 0 at that location.

package kanadeSir;

import java.util.Scanner;

public class Prob63_k {
	public static void main(String[] args) {
		int a[] = { 54, 38, 67, 53, 48 };
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("search");
		int search = sc.nextInt();
		for (i = 0; i < a.length; i++) {
			if (a[i] == search) {
				a[i] = 0;

			}

		}

		System.out.println("values after replacement");
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
