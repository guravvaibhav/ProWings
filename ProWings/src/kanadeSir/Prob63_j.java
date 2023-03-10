//	j. Take New input value. Search any value into an array & Replace this value with New value.

package kanadeSir;

import java.util.Scanner;

public class Prob63_j {
	public static void main(String[] args) {
		int a[] = { 54, 38, 67, 53, 48 };
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("search");
		int search = sc.nextInt();
		System.out.println("replace");
		int replace = sc.nextInt();
		for (i = 0; i < a.length; i++) {
			if (a[i] == search) {
				a[i] = replace;
				
				}

			}
		
	System.out.println("values after replacement");
	for (i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	}
}
