package intermediate;

import java.util.Arrays;

public class KLargestElementsInArray {
	public static void main(String[] args) {
		int[] A = { 12, 5, 787, 1, 23 };
		int k = 2;
		Arrays.sort(A);
		for (int i = A.length - 1; k > 0; k--, i--) {
			System.out.println(A[i]);
		}
	}
}
