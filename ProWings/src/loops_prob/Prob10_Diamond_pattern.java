package loops_prob;

public class Prob10_Diamond_pattern {

	public static void main(String[] args) {
	
		for(int i=1;i<=6;i++) {
			System.out.print("\n");
			for(int j=6;j>=i;j--)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print(" *");
		}
		
		for(int l=1;l<=5;l++) {
			System.out.print("\n ");
			for(int m=1;m<=l;m++)
				System.out.print(" ");
			for(int n=5;n>=l;n--)
				System.out.print(" *");
		}

	}

}
