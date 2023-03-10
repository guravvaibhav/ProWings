package loops_prob;

public class Prob2 {

	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=5;i++) {
			System.out.print("\n\n");
			for(int j=1;j<=i;j++) {
				System.out.print("\t\t"+a);
				a++;
			}
		}

	}

}
