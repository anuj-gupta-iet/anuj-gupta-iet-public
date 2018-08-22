package basic;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String[] arr = { "ab", "ab", "abc", "bca" }; // prints 3
		//String[] arr = { "ab", "aqb" }; // prints 0
		int counter = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			String s1 = arr[i];
			String s2 = arr[i + 1];
			if (s1.length() > s2.length()) {
				continue;
			}

			for (int j = 0, k = s1.length(); k <= s2.length(); j++, k++) {
				String s2substring = s2.substring(j, k);
				if (isAnagram(s1, s2substring)) {
					counter++;
					break;
				}
			}
		}
		System.out.println(counter);
	}

	private static boolean isAnagram(String a, String b) {
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i]) {
				return false;
			}
		}
		return true;
	}
}
