package basic;

import java.util.Arrays;

public class CheckTwoStringsAnagrams {
	public static void main(String[] args) {
		String s1 = "Army";
		String s2 = "Mary";
		if(s1.length() != s2.length()){
			System.out.println("Strings not equal");
			return;
		}
		char[] arr1 = s1.toLowerCase().toCharArray();
		char[] arr2 = s2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]!=arr2[i]){
				System.out.println("Strings not Anagram");
				return;
			}
		}
		System.out.println("Strings are Anagram");
	}
}
