package basic;

import java.util.HashSet;

public class PrintDuplicateCharectersFromString {
	public static void main(String[] args) {
		String str = "Java";
		char[] arr = str.toCharArray();
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if(!set.add(arr[i])){
				System.out.println(arr[i]);
			}
		}
	}
}
