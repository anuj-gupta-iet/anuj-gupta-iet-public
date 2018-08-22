package intermediate;

class PrintKSortedArraysInAscendingOrder {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 7, 9 };
		int[] a2 = { 3, 5, 6, 8, 10 };
		for (int i = 0, j = 0; (i + j) < (a1.length + a2.length);) {
			
			if (a1[i] < a2[j]) {
				System.out.print(a1[i++] + " ");
			} else {
				System.out.print(a2[j++] + " ");
			}
		}
	}
}