package basic;

import java.util.Arrays;

public class Countnumberoftripletswithproductequaltogivennumber {
	// better approach n^3 in worst case, avg case (n log n) + n = n log n
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 2, 3, 8 };
		int m = 24;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					int multiply = arr[i] * arr[j] * arr[k];
					if (multiply == m) {
						System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
					} else if (multiply > m) {
						System.out.println("Breaking at: " + arr[i] + "," + arr[j] + "," + arr[k]);
						break;
					}
				}
			}
		}
	}

	// n^3 approach
	public static void main1(String[] args) {
		int[] arr = { 1, 4, 6, 2, 3, 8 };
		int m = 24;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					int multiply = arr[i] * arr[j] * arr[k];
					if (multiply == m) {
						System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
					}
				}
			}
		}
	}
}
