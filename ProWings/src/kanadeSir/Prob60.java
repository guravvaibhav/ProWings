//	60. Print 1 to 10 Numbers on Screen But if value becomes 7 Skip this value using continue statement.

package kanadeSir;

public class Prob60 {
	public static void main(String[] args) {
		printNumtill7();
	}

	private static void printNumtill7() {
		for (int i = 1; i <= 10; i++) {
			if (i == 7)
				continue;
			System.out.println(i);
		}
	}
}
