import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Anagram {
	static boolean isAnagram(String str1, String str2) {
		boolean isAnag = true;
		if (str1 == null || str2 == null || str1.length() != str2.length()) {
			return false;
		}
		int[] charCount = new int[26];
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int length = str1.length();

		for (int i = 0; i < length; i++) {
			charCount[ch1[i] - 'a']++;
			charCount[ch2[i] - 'a']--;
		}

		for (int count : charCount) {
			if (count != 0) {
				isAnag = false;
				break;
			}
		}
		return isAnag;
	}

	static boolean isAnagramUnicode(String str1, String str2) {
		boolean isAnag = true;
		if (str1 == null || str2 == null || str1.length() != str2.length()) {
			return false;
		}
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int length = str1.length();
		Map<Character, Integer> charMap = new HashMap();

		for (int i = 0; i < length; i++) {
			int ch1Count = charMap.get(ch1[i]) != null ? (charMap.get(ch1[i])) : 0;
			charMap.put(ch1[i], ++ch1Count);
			int ch2Count = charMap.get(ch2[i]) != null ? (charMap.get(ch2[i])) : 0;
			charMap.put(ch2[i], --ch2Count);
		}
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() != 0) {
				isAnag = false;
				break;
			}
		}
		return isAnag;
	}

	public static void main(String[] args) {
//		System.out.println(isAnagram("silent", "listen"));
		System.out.println(isAnagramUnicode("si:lent", "listen,"));
	}

}
