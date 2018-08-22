package basic;


public class AddTwoNumbersWithoutUsingArithmeticOperators {
	public static void main(String[] args) {
		/*
		 * Sum of two bits can be obtained by performing XOR (^) of the two
		 * bits. Carry bit can be obtained by performing AND (&) of two bits.
		 */
		int a = 4;
		int b = 8;
		char[] binA = Integer.toBinaryString(a).toCharArray();
		char[] binB = Integer.toBinaryString(b).toCharArray();
		int[] binSum = new int[(binA.length > binB.length ? binA.length : binB.length)];
		for (int i = (binA.length > binB.length ? binA.length - 1 : binB.length - 1); i > 0; i--) {
			int sum = (i < binA.length ? binA[i] : 0) ^ (i < binB.length ? binB[i] : 0);
			int carry = (i < binA.length ? binA[i] : 0) & (i < binB.length ? binB[i] : 0);
			binSum[i] = sum;
		}
		for (int i = 0; i < binSum.length; i++) {
			System.out.println(binSum[i]);
		}
	}
}
