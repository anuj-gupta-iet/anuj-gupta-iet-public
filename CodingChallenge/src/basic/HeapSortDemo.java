package basic;

import java.util.Arrays;

public class HeapSortDemo {
	static int[] arr = { 4, 3, 7, 1, 8, 5 };
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		heapsort();
		System.out.println(Arrays.toString(arr));
		// print [1, 3, 4, 5, 7, 8]
	}

	static void heapsort() {
		int heapsize = arr.length;
		for (int i = (heapsize / 2) - 1; i >= 0; i--) {
			heapify(heapsize, i);
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			int tmp = arr[0];
			arr[0] = arr[i];
			arr[i] = tmp;
			heapify(i, 0);
		}
	}

	static void heapify(int heapsize, int rootindex) {
		int largestindex = rootindex;
		int leftchildindex = rootindex * 2 + 1;
		int rightchildindex = rootindex * 2 + 2;
		if (leftchildindex < heapsize && arr[leftchildindex] > arr[largestindex]) {
			largestindex = leftchildindex;
		}
		if (rightchildindex < heapsize && arr[rightchildindex] > arr[largestindex]) {
			largestindex = rightchildindex;
		}
		if (largestindex != rootindex) {
			int tmp = arr[rootindex];
			arr[rootindex] = arr[largestindex];
			arr[largestindex] = tmp;
			heapify(heapsize, largestindex);
		}
	}
}
