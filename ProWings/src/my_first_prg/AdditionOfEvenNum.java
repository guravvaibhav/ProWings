package my_first_prg;

public class AdditionOfEvenNum {
	public static void main(String[] args) {
		int a[] = { 23, 46, 87, 32, 94 };
		int res = printEvenNum(a);
		System.out.println(res);
	}
	private static int printEvenNum(int[] a){
		int sum = 0;
		for (int x : a){
			if (x % 2 == 0){
				  System.out.println(x); sum = sum + x;
			}
		}
		return sum;
	}
}
