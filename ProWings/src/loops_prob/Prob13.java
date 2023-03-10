package loops_prob;

public class Prob13 {

	public static void main(String[] args) {
		int w=1;
		for(int i=1;i<=5;i++) {
			System.out.print("\n");
			for(int j=5;j>=i;j--)
				System.out.print("  ");
			w=1;
			for(int k=1;k<=i;k++) {
				System.out.print(" "+w);
				w++;
			}
		}

	}

}
