package bigin_with_java_prob;

public class Prob13 {

	public static void main(String[] args) {
		
		
		System.out.println("armstrong number is");
		
		for(int i=1;i<=500;i++) {
			
			if(i<=9)
				System.out.println(i);
			if(i>9&&i<100) {
				int num1=i%10;
				int sq1=num1*num1;
				int num2=i/10;
				int sq2=num2*num2;
			
			if(i==sq1+sq2)
					System.out.println(i);
			}
			if(i>100&&i<1000)
			{
			int num1=i%10;
			int cube1=num1*num1*num1;
			
			int num20=i/10;
			int num2=num20%10;
			int cube2=num2*num2*num2;
			
			int num3=i/100;
			int cube3=num3*num3*num3;
			
			if(i==cube1+cube2+cube3)
			System.out.println(i);	
			
		}
		}
			

		
	}

}
