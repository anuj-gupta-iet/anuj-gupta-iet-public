package intermediate;

import java.util.Random;

public class GetRandomInRangeMtoN {
	public static void main(String[] args) throws InterruptedException {
		while (true) {
			System.out.println(getMyRandonNumber(23, 25));
			Thread.sleep(1000);
		}
	}

	private static int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt();
	}

	private static int getMyRandonNumber(int min, int max) {
		int diff = max - min;
		int r = Math.abs(getRandomNumber());
		int modDiff = r % diff;
		return min + modDiff;
	}

}
