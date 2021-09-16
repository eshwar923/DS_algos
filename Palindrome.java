
public class Palindrome {
	
	static boolean isPalindrome(String s) {
		if (s == null || s.length() == 0 || s.length() > 50)
			return false;

		int length = s.length();
		for (int i = 0; i <= length / 2; i++) {
			if (s.charAt(i) != s.charAt(length-1 - i))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
//		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("abccba"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
