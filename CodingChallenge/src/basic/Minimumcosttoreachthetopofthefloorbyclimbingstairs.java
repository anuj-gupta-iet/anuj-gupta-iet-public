package basic;

public class Minimumcosttoreachthetopofthefloorbyclimbingstairs {
	public static void main(String[] args) {
		// int[] a = { 16, 19, 10, 12, 18 };
		int[] a = { 2, 5, 3, 1, 7, 3, 4 };
		System.out.println(returnMin(-1, 0, a));
	}

	private static int returnMin(int currentStep, int sumTillNow, int[] a) {
		if (currentStep == a.length - 1 || currentStep == a.length - 2) {
			return sumTillNow;
		}

		int v1 = returnMin(currentStep + 1, sumTillNow + a[currentStep + 1], a);
		int v2 = returnMin(currentStep + 2, sumTillNow + a[currentStep + 2], a);
		if (v1 > v2) {
			return v2;
		} else {
			return v1;
		}

	}
}
