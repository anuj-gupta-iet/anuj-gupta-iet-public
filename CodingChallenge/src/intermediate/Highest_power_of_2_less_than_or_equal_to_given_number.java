
public class Highest_power_of_2_less_than_or_equal_to_given_number {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(Integer.toBinaryString(n));
		int len = Integer.toBinaryString(n).length() - 1;
		System.out.println((int) Math.pow(2, len));
	}
}
