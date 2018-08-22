package intermediate;

import java.util.HashMap;

public class FindFirstNonRepeatingCharecter {
	public static void main(String[] args) {
		// String str = "GeeksforGeeks"; // prints f
		String str = "GeeksQuiz"; // prints g
		// method1(str);// uses O(n^2) time complexity
		method2(str);// uses O(n) time complexity and O(n) space complexity
	}

	static void method2(String str) {
		/*
		 * We scan the string from left to right counting the number occurrences
		 * of each character in a Hashtable. Then we perform a second pass and
		 * check the counts of every character. Whenever we hit a count of 1 we
		 * return that character, that’s the first unique letter
		 */
		str = str.toLowerCase();
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> countMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (countMap.get(arr[i]) == null) {
				countMap.put(arr[i], 1);
			} else {
				int count = countMap.get(arr[i]);
				countMap.put(arr[i], ++count);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (countMap.get(arr[i]) == 1) {
				System.out.println(arr[i]);
				return;
			}
		}

	}

	static void method1(String str) {
		str = str.toLowerCase();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			boolean duplicateFound = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (c == arr[j]) {
					duplicateFound = true;
					break;
				}
			}
			if (!duplicateFound) {
				System.out.println(c);
				return;
			}
		}
	}
}
