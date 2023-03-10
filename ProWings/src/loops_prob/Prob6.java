package loops_prob;

public class Prob6 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("\n");
			int k=5;
			for(int j=1;j<=i;j++) {
				System.out.print("\t"+k);
				k--;
			}
		}
	}

}
