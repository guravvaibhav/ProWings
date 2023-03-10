//	l. Search value & Delete value. But Store 0 at the End of array.

package kanadeSir;

import java.util.Scanner;

public class Prob63_l {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b[] = new int[5];
		int a[] = { 65, 34, 23, 76, 45 };
		int j = 0;
		System.out.println("enter value you want to search");
		int num = sc.nextInt();
		for (int i = 0; i < a.length; i++) {

			if (a[i] != num) {
				b[j] = a[i];
				j++;
			}

		}
		for (int i = 0; i < 5; i++)
			System.out.println(b[i]);
	}
}
