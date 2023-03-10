package my_first_prg;

public class VarArgMethod {
	public static void main(String[] args) {
		sum();
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
	}
	public static void sum(int ...x) {
		int sum=0;
		for(int n:x) {
			sum=sum+n;
		}
		System.out.println("sum is : "+sum);
	}

}
