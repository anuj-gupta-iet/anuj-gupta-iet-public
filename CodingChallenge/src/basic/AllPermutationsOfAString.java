import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllPermutationsOfAString {
	static List<String> permutationsList = new ArrayList<String>();

	public static void main(String[] args) {
		String input = "adbecf";
		findPermutations(input);
		Collections.sort(permutationsList);
		int rank = 1;
		for (String permutation : permutationsList) {
			if (permutation.equals(input)) {
				System.out.println(rank);
				return;
			}
			rank++;
		}
	}

	public static void findPermutations(String input) {
		permutation("", input);
	}

	private static void permutation(String perm, String word) {
		System.out.println("\t" + perm + ", " + word);
		if (word.isEmpty()) {
			System.out.println(perm + word);
			permutationsList.add(perm + word);
			return;
		}
		for (int i = 0; i < word.length(); i++) {
			permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
		}
	}

}
