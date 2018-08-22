package intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class FindMaximumRepeatedWordsFromFile {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"));
		String s;
		ArrayList<String> words = new ArrayList<>();
		while ((s = reader.readLine()) != null) {
			words.addAll(Arrays.asList(s.split(" ")));
		}
		HashMap<String, Integer> hm = new HashMap<>();
		for (String word : words) {
			Integer wordcount = hm.get(word);
			if (wordcount == null) {
				hm.put(word, 1);
			} else {
				hm.put(word, ++wordcount);
			}
		}
		// System.out.println(hm);
		String maxword = "";
		int maxcount = 0;
		for (Entry<String, Integer> entry : hm.entrySet()) {
			int count = entry.getValue();
			if (count > maxcount) {
				maxword = entry.getKey();
				maxcount = count;
			}
		}
		System.out.println(maxword);
		System.out.println(maxcount);
		reader.close();
	}
}
