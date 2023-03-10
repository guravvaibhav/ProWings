package array;
import java.util.Scanner;
public class AscendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter values");
			a[i] = sc.nextInt();
		}
		a = ascendingOrder(a);
		for (int n : a)
			System.out.println(n);
	}
	public static int[] ascendingOrder(int[] a) {
		int t;
		for (int i = 1; i < a.length; i++) {
			for (int j=i; j < a.length; j++) {
				if (a[j] < a[j - 1]) {
					t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
		}
		return a;
	}
}
