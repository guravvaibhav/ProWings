package loops_prob;

public class Prob8 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.print("\n");
			for(int j=5;j>=i;j--)
				System.out.print("  ");	
				for(int k=1;k<=i;k++)
					System.out.print(" *");
				
			}
		}

	

}
 