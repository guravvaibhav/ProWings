package kanadeSir;
// 83. Get input 2 different Strings & Merge into 3rd String.
public class Prob83 {
	public static void main(String[] args) {
		
	String s="sita-";
	String s1="ram";
	
	String s3=s+s1;									// 1
	String s4=s.concat(s1);							// 2
	System.out.println(s3);
	System.out.println(s4);

	}
}
