package kanadeSir;
// 82. Copy one String into Another.
public class Prob82 {
	public static void main(String[] args) {
		String s=new String("ram");
		String s1=s;
		String s2=new  String(s);
		String s3=String.valueOf(s);
		s="abc";
		
		char[]ch= {'r','a','m'};
		String s5=String.valueOf(ch);
		
		String s4=String.valueOf(ch, 0, 3);
		System.out.println(s4);
		System.out.println(s5);
		
//		System.out.println(s==s2);
//		System.out.println(s==s3);
//		System.out.println(s==s1);
		
		
		
	}

}
