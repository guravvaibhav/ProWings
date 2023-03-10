package array;

public class PrimeNumInArray {
	public static void main(String[] args) {
		int a[] = {15,21,73,4,5,6,7,8,100};
		printPrimeNum(a);
	}
	private static void printPrimeNum(int[] a) {
		int i, j, count = 0;
		for (i = 0; i < a.length; i++) {
			for (j = 2; j <= (a[i] / 2); j++) {
				if (a[i] % j == 0)
					count++;
			}
			if (count == 0)
				System.out.println(a[i]);
			count = 0;
		}
	}
}
