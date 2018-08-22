package basic;


public class ReverseAString {
	public static void main(String[] args) {
		String str = "AnujtGupt";
		iteration(str);
		String s = recursion(str.toCharArray(), 0, str.length() - 1);
		System.out.println(s);
	}

	private static String recursion(char[] arr, int i, int j) {

		// base condition
		if (i + 1 < j - 1) {
			return arr[j] + recursion(arr, i + 1, j - 1) + arr[i];
		} else {
			return arr[j] + "" + arr[i];
		}

	}

	private static void iteration(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			swap(arr, i, arr.length - i - 1);
		}
		System.out.println(arr);
	}

	private static void swap(char[] arr, int i, int j) {
		char tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
