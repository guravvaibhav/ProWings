package array;

import java.util.Scanner;

public class Pract9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[] = { 9, 7, 9, 5 };
		System.out.println("enter search value");
		int num = sc.nextInt();
		int i;
		int c = 0;

		for (i = 0; i < a.length; i++) {
			if (a[i] == num) {
				System.out.println(num + " is present at index " + i);
				c++;

			}

		}
		if (c == 0)
			System.out.println("match not found");
		System.out.println("\n\n\t\ttotal match found " + c);
	}
}
