package kanadeSir;
// 81. Display Reverse String.
public class Prob81 {
	public static void main(String[] args) {
		String s="sita-ram";
		String reverse=reverse(s);
		System.out.println(reverse);
//		String modified=reverseByLoop(s);
//		System.out.println(modified);
	}
	public static String reverse(String s) {
		StringBuffer sb=new StringBuffer(s);
		return	new StringBuffer(s).reverse().toString();
//		return new String(sb.reverse());
	}
	public static String reverseByLoop(String s) {
		char ch[]=s.toCharArray();
		char chnew[]=new char[ch.length];
		int count=0;
		for(int i=ch.length-1;i>=0;i--) {
			chnew [count]=ch[i];
			count++;
		}
		String modified=new String(chnew);
		
		return modified;
	}
}
