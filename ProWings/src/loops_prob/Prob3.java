package loops_prob;

public class Prob3 {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++) {
			System.out.print("\n\n");
			k=1;
			for(int j=1;j<=i;j++) {
				System.out.print("\t"+k);
				if(k==2)
					k=1;
				else
					k++;
			}
		}

	}

}
