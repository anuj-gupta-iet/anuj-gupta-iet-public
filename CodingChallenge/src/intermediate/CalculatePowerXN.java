package intermediate;

public class CalculatePowerXN {
	public static void main(String[] args) {
		int x = 2;
		int n = 16;
		int result;
		if (n % 2 == 0) {
			result = power(x, n);
		} else {
			result = power(x, n - 1) * x;
		}
		System.out.println(result);
	}

	private static int power(int x, int n) {
		if (n == 1) {
			return x;
		}
		return power(x, n / 2) * power(x, n / 2);
	}
}
