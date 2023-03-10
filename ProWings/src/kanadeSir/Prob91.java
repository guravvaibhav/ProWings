package kanadeSir;

// 91. Accept any String & Display it is Palindrome or Not.
public class Prob91 {
	public static void main(String[] args) {
		String s = "radar";
		if (isPalindrom(s))
			System.out.println(s + " is palindrom");
		else
			System.out.println(s + " is not a palindrom");
	}
	public static boolean isPalindrom(String input) {
		StringBuffer sb = new StringBuffer(input);
		String reverse = new String(sb.reverse());
		return input.equals(reverse);
	}

}
