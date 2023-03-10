
//62. Create an array having 5 elements store values into it & then display all values on the screen.

package kanadeSir;

import java.util.Scanner;

public class Prob62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int i;
		for (i = 0; i < a.length; i++) {
			System.out.println("enter value");
			a[i] = sc.nextInt();
		}
		System.out.println("values in array are");
		for (int n : a) {
			System.out.println(n);
		}

	}

}
