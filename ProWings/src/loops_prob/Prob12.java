package loops_prob;

public class Prob12 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		System.out.print("\n");
		for(int j=1;j<=i;j++)
			System.out.print(" ");
		for(int k=5;k>=i;k--)
			System.out.print(" *");
	}
	for(int l=1;l<=5;l++) {
		System.out.print("\n");
		for(int m=5;m>=l;m--)
			System.out.print(" ");
		for(int n=1;n<=l;n++)
			System.out.print(" *");
	}
		
}
}
