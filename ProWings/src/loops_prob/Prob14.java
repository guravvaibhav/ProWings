package loops_prob;

public class Prob14 {

	public static void main(String[] args) {
	
		for(int i=1;i<=5;i++) {
			
			System.out.print("\n");
			for(int j=5;j>=i;j--) 
				System.out.print(" ");
			for(int k=i;k>=2;k--)
				System.out.print(+k);
			for(int l=1;l<=i;l++)
				System.out.print(+l);
			}
			
		

	}

}

