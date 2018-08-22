package basic;

import java.util.HashMap;

public class Checkiftwostringsarepermutationofeachother {
	public static void main(String[] args) {
		String s1 = "abcdr";
		String s2 = "dabc";
		HashMap<Character, Integer> hm = new HashMap<>();
		for (Character c : s1.toCharArray()) {
			if (hm.get(c) == null) {
				hm.put(c, 1);
			} else {
				int count = hm.get(c);
				hm.put(c, ++count);
			}
		}
		for (Character c : s2.toCharArray()) {
			if (hm.get(c) == null) {
				System.out.println("Invalid");
				return;
			}
			int count = hm.get(c);
			hm.put(c, --count);
		}
		for (int count : hm.values()) {
			if (count != 0) {
				System.out.println("Invalid");
				return;
			}
		}
		System.out.println("Valid");
	}
}
