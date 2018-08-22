package basic;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 14, 33, 27, 10, 35, 19, 42, 44 };
		sort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	static void sort(int[] arr, int low, int high) {
		int N = high - low;
		if (N <= 1)
			return;
		int mid = low + N / 2;
		// recursively sort
		sort(arr, low, mid);
		sort(arr, mid, high);
		// merge two sorted subarrays
		int[] temp = new int[N];
		int i = low, j = mid;
		for (int k = 0; k < N; k++) {
			if (i == mid)
				temp[k] = arr[j++];
			else if (j == high)
				temp[k] = arr[i++];
			else if (arr[j] < arr[i])
				temp[k] = arr[j++];
			else
				temp[k] = arr[i++];
		}
		for (int k = 0; k < N; k++)
			arr[low + k] = temp[k];
	}
}
