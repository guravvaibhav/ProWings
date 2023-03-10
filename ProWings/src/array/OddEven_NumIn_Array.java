package array;

public class OddEven_NumIn_Array {
	public static void main(String[] args) {
		int a[] = { 12, 34, 46, 57, 965, 35, 55, 3 };
		printEvenNum(a);
	}
	private static void printEvenNum(int[] a) {
		for (int n : a) {
			if (n % 2 == 0)
				System.out.println(n);
		}
	}
}
