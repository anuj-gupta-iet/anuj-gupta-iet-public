import java.util.HashMap;

public class FindAnagramCountInStringArray {
	public static void main(String[] args) {
		String[] arr = { "xyz", "yxz", "ab", "abc", "zxy", "zz" };
		HashMap<Integer, Integer> count = new HashMap<>();
		HashMap<String, Integer> hashM = new HashMap<>();
		for (String s : arr) {
			char[] carr = s.toCharArray();
			int hash = 0;
			for(char c:carr){
				int i = (int)c;
				hash+=i;
			}
		}
	}
}
