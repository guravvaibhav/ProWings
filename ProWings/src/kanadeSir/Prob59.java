// 59. Take input 100 Numbers if Number becomes in between 500 & 600 then loop must be stop.
package kanadeSir;

import java.util.Scanner;

public class Prob59 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		for(int i=1;i<=10;i++) {
			num=sc.nextInt();
			if(num>=500&&num<=600)
				break;
			System.out.println(num);
		}
}
}
