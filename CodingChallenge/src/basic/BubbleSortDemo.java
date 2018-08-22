package basic;

import java.util.Arrays;

public class BubbleSortDemo {
	public static void main(String[] args) {
		int[] arr = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					swap(arr, j, i);
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int j, int i) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
