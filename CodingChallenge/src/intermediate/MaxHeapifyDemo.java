
public class MaxHeapifyDemo {
	public static void main(String[] args) {
		int[] a = { 4, 3, 7, 1, 8, 5 };
		int rootindex = 0;
		maxheapify(a, rootindex);
	}

	private static void maxheapify(int[] a, int rootindex) {
		int leftchildindex = (rootindex * 2) + 1;
		int rightchildindex = (rootindex * 2) + 2;
		if (a[leftchildindex] > a[rightchildindex]) {
			if (a[leftchildindex] > a[rootindex]) {
				swap(a, leftchildindex, rootindex);
			}
		} else {
			if (a[rightchildindex] > a[rootindex]) {
				swap(a, rightchildindex, rootindex);
			}
		}
		
	}

	private static void swap(int[] a, int leftchildindex, int rootindex) {

	}
}
