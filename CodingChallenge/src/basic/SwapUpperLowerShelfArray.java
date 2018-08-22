import java.util.Arrays;

public class SwapUpperLowerShelfArray {
	public static void main(String[] args) {
		int[] arr = { 1, 6, 7, 4, 0, 6, 4, 5, 2 };
		System.out.println(Arrays.toString(arr));
		// prints [1, 6, 7, 4, 0, 6, 4, 5, 2]
		int lowindex = 0;
		int highindex = arr.length - 1;
		while (lowindex < highindex) {
			swap(arr, lowindex, highindex);
			lowindex++;
			highindex--;
		}
		System.out.println(Arrays.toString(arr));
		// prints [2, 5, 4, 6, 0, 4, 7, 6, 1]
	}

	private static void swap(int[] arr, int lowindex, int highindex) {
		int tmp = arr[lowindex];
		arr[lowindex] = arr[highindex];
		arr[highindex] = tmp;
	}
}
