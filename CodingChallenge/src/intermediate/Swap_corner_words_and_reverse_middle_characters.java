import java.util.Arrays;

public class Swap_corner_words_and_reverse_middle_characters {
	public static void main(String[] args) {
		String input = "Hello World GFG Welcomes You";
		String[] inputArr = input.split(" ");
		String[] outputArr = new String[inputArr.length];
		outputArr[0] = inputArr[inputArr.length - 1];
		outputArr[outputArr.length - 1] = inputArr[0];
		for (int i = 1; i <= inputArr.length / 2; i++) {
			String reverse1 = reverse(inputArr[i]);
			String reverse2 = reverse(inputArr[inputArr.length - 1 - i]);
			outputArr[outputArr.length - 1 - i] = reverse1;
			outputArr[i] = reverse2;
		}
		System.out.println(Arrays.toString(outputArr));
		// prints [You, semcoleW, GFG, dlroW, Hello]
	}

	private static String reverse(String string) {
		char[] c = string.toCharArray();
		for (int i = 0; i <= c.length / 2; i++) {
			char temp = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = temp;
		}
		return new String(c);
	}
}
